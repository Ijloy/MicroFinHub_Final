public class ArbolBinario {

    private class Nodo {
        InstrumentoFinanciero instrumento;
        Nodo izquierda, derecha;

        Nodo(InstrumentoFinanciero i) {
            instrumento = i;
        }
    }

    private Nodo raiz;

    public void insertar(InstrumentoFinanciero i) {
        raiz = insertarRec(raiz, i);
    }

    private Nodo insertarRec(Nodo actual, InstrumentoFinanciero i) {
        if (actual == null) return new Nodo(i);

        if (i.getId() < actual.instrumento.getId())
            actual.izquierda = insertarRec(actual.izquierda, i);
        else
            actual.derecha = insertarRec(actual.derecha, i);

        return actual;
    }

    public InstrumentoFinanciero buscar(int id) {
        return buscarRec(raiz, id);
    }

    private InstrumentoFinanciero buscarRec(Nodo actual, int id) {
        if (actual == null) return null;
        if (actual.instrumento.getId() == id) return actual.instrumento;

        return id < actual.instrumento.getId()
                ? buscarRec(actual.izquierda, id)
                : buscarRec(actual.derecha, id);
    }

    public void eliminar(int id) {
        raiz = eliminarRec(raiz, id);
    }

    private Nodo encontrarMinimo(Nodo actual) {
        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }
        return actual;
    }

    private Nodo eliminarRec(Nodo actual, int id) {
        if (actual == null) return null;

        if (id < actual.instrumento.getId()) {
            actual.izquierda = eliminarRec(actual.izquierda, id);
        } else if (id > actual.instrumento.getId()) {
            actual.derecha = eliminarRec(actual.derecha, id);
        } else {

            // Caso 1: sin hijo izquierdo
            if (actual.izquierda == null)
                return actual.derecha;

            // Caso 2: sin hijo derecho
            if (actual.derecha == null)
                return actual.izquierda;

            // Caso 3: tiene dos hijos
            Nodo sucesor = encontrarMinimo(actual.derecha);

            // Reemplazar datos
            actual.instrumento = sucesor.instrumento;

            // Eliminar el sucesor del subárbol derecho
            actual.derecha = eliminarRec(actual.derecha, sucesor.instrumento.getId());
        }

        return actual;
    }
}
