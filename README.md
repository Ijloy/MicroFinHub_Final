[English Version](#english-version) | [Versión en Español](#versión-en-español)


## English Version
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
Software Engineering Student  
Focused on backend logic, data structures, and system architecture.

---

## Versión en Español

---

# 📈 Sistema de Gestión de Inversiones

Sistema de escritorio desarrollado en **Java + Swing** que simula una plataforma de gestión de inversiones con roles de **Administrador** e **Inversionista**, incluyendo estructuras de datos como listas, colas y árbol binario.

---

## 🚀 Características Principales

### 👤 Gestión de Usuarios
- Registro e inicio de sesión de inversionistas
- Autenticación de administrador
- Control de roles (Administrador / Inversionista)
- Cierre de sesión

### 💰 Gestión de Inversiones
- Registro de inversiones
- Eliminación de inversiones
- Cálculo automático del total invertido
- Procesamiento de inversiones mediante cola (FIFO)

### 📊 Gestión de Instrumentos Financieros
- Agregar instrumentos (Administrador)
- Eliminar instrumentos (Administrador)
- Listado dinámico en tabla
- Generación automática de ID

### 🕓 Historial de Eventos
- Registro global del sistema
- Historial específico del inversionista

---

## 🧠 Estructuras de Datos Utilizadas

| Estructura | Uso |
|------------|------|
| `ArrayList` | Almacenar instrumentos e inversiones |
| `Queue (LinkedList)` | Procesamiento de inversiones |
| `Árbol Binario` | Organización de instrumentos financieros |
| `JTable` | Visualización de datos |
| `HashMap` *(en otros proyectos del repositorio)* | Gestión eficiente por clave |

---

## 🏗️ Arquitectura del Proyecto

SistemaInversiones
│
├── Usuario (Clase abstracta)
│ ├── Administrador
│ └── Inversionista
│
├── InstrumentoFinanciero
├── Inversion
├── Portafolio
├── Historial
├── ArbolBinario
└── Ventana (Interfaz Gráfica - Swing)


---

## 🖥️ Interfaz Gráfica

Desarrollada con **Java Swing**, incluye:

- Panel de login
- Panel de inversión
- Visualización de portafolio
- Gestión administrativa de instrumentos
- Tablas dinámicas con actualización automática

---

## 🔐 Roles del Sistema

### 👨‍💼 Administrador
- Inicia sesión con credenciales predefinidas
- Puede agregar y eliminar instrumentos
- Accede a todos los módulos

### 👨‍💻 Inversionista
- Se registra automáticamente si no existe
- Puede invertir
- Puede eliminar inversiones
- Visualiza su portafolio y total invertido

---

## 📦 Tecnologías Utilizadas

- Java
- Java Swing
- Programación Orientada a Objetos (POO)
- Estructuras de datos
- Modelo Cliente–Sistema

---

## 🎯 Objetivos Académicos

Este proyecto demuestra:

- Aplicación de POO
- Uso de estructuras dinámicas
- Manejo de roles y autenticación
- Separación de responsabilidades
- Diseño modular
- Gestión de eventos en interfaces gráficas

---

## 📌 Posibles Mejoras Futuras

- Persistencia de datos con archivos o base de datos
- Encriptación de contraseñas
- Implementación completa del árbol binario en el sistema
- Validaciones más robustas
- Patrón MVC
- Exportación de reportes

---

## 👨‍💻 Autor

**Dereck Proaño**  
Estudiante de Ingeniería de Software  
Proyecto académico – 2026

---

⭐ Si te interesa el proyecto, puedes dejar una estrella en el repositorio.
