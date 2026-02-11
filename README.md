# 💼 Investment Management System
### Java | OOP | Data Structures | Swing GUI

A desktop investment management application developed in **Java**, applying **Object-Oriented Programming principles**, core **data structures**, and a graphical interface built with **Java Swing**.

This project demonstrates solid understanding of software design, architecture organization, and data handling in a structured academic environment.

---

## 🚀 Project Overview

The system simulates a financial investment platform where:

- Investors can register and manage their investments.
- Administrators can manage financial instruments.
- Investment history is tracked dynamically.
- Portfolio totals are calculated in real time.

The application follows a structured layered design:

- **Model Layer (Business Logic)**
- **Control Layer (System Core)**
- **View Layer (GUI with Swing)**

---

## 🧠 Technical Concepts Applied

- Object-Oriented Programming (OOP)
- Inheritance & Encapsulation
- Abstract Classes
- Binary Search Tree (BST)
- ArrayList & Queue (LinkedList)
- Event-driven programming
- Dynamic table models (JTable)
- Session handling
- Basic system architecture design

---

## 🏗 Architecture

📦 InvestmentSystem
┣ 📄 Usuario.java
┣ 📄 Administrador.java
┣ 📄 Inversionista.java
┣ 📄 InstrumentoFinanciero.java
┣ 📄 Inversion.java
┣ 📄 Portafolio.java
┣ 📄 Historial.java
┣ 📄 ArbolBinario.java
┣ 📄 SistemaInversiones.java
┗ 📄 Ventana.java


### 🔹 Model
Contains domain logic and entities.

### 🔹 Controller
`SistemaInversiones` acts as the system core, managing:
- Users
- Instruments
- Investments
- Session state
- History tracking

### 🔹 View
`Ventana.java` provides a graphical interface using:
- JFrame
- JTabbedPane
- JTable
- JComboBox
- JOptionPane

---

## 📊 Core Features

### 👤 Investor
- Register / Login
- Add investment
- Remove investment
- View portfolio
- View investment history
- Real-time total calculation

### 🛠 Administrator
- Login authentication
- Add new financial instruments
- Remove instruments
- Auto-generate unique instrument IDs

### 📈 Portfolio
- Dynamic investment storage (ArrayList)
- FIFO processing queue (Queue)
- Total investment calculation

### 🌳 Data Structure
Binary Search Tree implementation for financial instruments:
- Insert
- Search
- Delete

---

## 🔐 Default Credentials

**Administrator**
ID: admin1
Password: 1234


Investors are automatically registered if the ID does not exist.

---

## ⚙️ How to Run

1. Clone repository:
git clone https://github.com/yourusername/yourrepository.git


2. Open in:
- IntelliJ IDEA
- Eclipse
- NetBeans

3. Run:
Ventana.java


---

## 📌 Sample Initial Instruments

- Stocks
- Bonds
- Cryptocurrencies

---

## 📈 Skills Demonstrated

✔ Java Desktop Application Development  
✔ OOP Design  
✔ Data Structure Implementation  
✔ GUI Event Handling  
✔ Collection Framework Usage  
✔ Clean Class Organization  
✔ System Logic Separation  

---

## 🔮 Future Improvements

- Password encryption (Hashing)
- Database integration (MySQL)
- Persistent storage
- Full MVC refactor
- Balanced tree implementation
- Edit instrument functionality
- Data validation enhancements
- Export reports (PDF / Excel)
- Performance optimizations

---

## 🎯 Academic Purpose

This project was developed to strengthen knowledge in:

- Software Engineering fundamentals
- Data Structures
- Java Desktop Development
- System organization and scalability principles

---

## 👨‍💻 Author

**Dereck Proaño**  

---

## 🇪🇸 Versión en Español

💼 Sistema de Inversiones

Sistema de gestión de inversiones desarrollado en Java con interfaz gráfica Swing, aplicando Programación Orientada a Objetos (POO) y estructuras de datos como listas, colas y árbol binario.

📌 Descripción del Proyecto

Este sistema permite:

Registro y autenticación de inversionistas

Autenticación de administrador

Gestión de instrumentos financieros

Registro y eliminación de inversiones

Cálculo del total invertido

Historial de eventos

Procesamiento de inversiones con estructura de cola

Organización de instrumentos mediante árbol binario

El proyecto simula el funcionamiento básico de una plataforma financiera.

🧠 Conceptos Aplicados
🔹 Programación Orientada a Objetos

Herencia (Usuario → Inversionista / Administrador)

Encapsulamiento

Polimorfismo

Clases abstractas

🔹 Estructuras de Datos

ArrayList → almacenamiento de instrumentos e inversiones

Queue (LinkedList) → procesamiento de inversiones

Árbol Binario → organización y búsqueda de instrumentos

JTable con DefaultTableModel → visualización de datos

🔹 Interfaz Gráfica

JFrame

JTabbedPane

JTable

JOptionPane

JComboBox

Eventos con ActionListener

👥 Roles del Sistema
👤 Inversionista

Registrarse o iniciar sesión

Registrar inversiones

Eliminar inversiones

Ver su portafolio

Consultar historial

Ver total invertido

👨‍💼 Administrador

Iniciar sesión

Agregar instrumentos financieros

Eliminar instrumentos

Visualizar instrumentos disponibles

🏗️ Arquitectura del Proyecto
Clases principales:

SistemaInversiones → Lógica central del sistema

Usuario (abstracta)

Inversionista

Administrador

InstrumentoFinanciero

Inversion

Portafolio

Historial

ArbolBinario

Ventana (Interfaz gráfica)

▶️ Cómo Ejecutar el Proyecto

Clonar el repositorio:

git clone https://github.com/tuusuario/turepositorio.git


Abrir el proyecto en IntelliJ IDEA o NetBeans.

Ejecutar la clase:

Ventana.java

🔐 Credenciales por Defecto

Administrador:

ID: admin1
Contraseña: 1234

📊 Funcionalidades Destacadas

✔ Registro automático de nuevos inversionistas
✔ Generación automática de ID para instrumentos
✔ Validación de datos (precio, riesgo, montos)
✔ Cálculo dinámico del total invertido
✔ Historial separado para inversionista
✔ Procesamiento FIFO de inversiones
✔ Control de acceso por rol

📈 Posibles Mejoras Futuras

Persistencia con base de datos

Encriptación de contraseñas

Arquitectura MVC separada

Manejo avanzado de excepciones

Reportes en PDF

Dashboard con gráficos

Tests unitarios

🎯 Objetivo Académico

Este proyecto fue desarrollado como práctica para fortalecer:

Modelado de sistemas reales

Aplicación de estructuras de datos

Desarrollo de interfaces gráficas

Diseño orientado a objetos

Separación de responsabilidades

🧑‍💻 Autor

Desarrollado por: Dereck Proaño
Estudiante de Ingeniería de Software

Software Engineering Student  
Focused on backend logic, data structures, and system architecture.
