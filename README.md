[English Version](#english-version) | [Versión en Español](#versión-en-español)

## English Version
---

# 📈 Investment Management System

Desktop application developed in **Java + Swing** that simulates an investment management platform with **Administrator** and **Investor** roles, including data structures such as lists, queues, and a binary tree.

---

## 🚀 Main Features

### 👤 User Management
- Investor registration and login
- Administrator authentication
- Role-based access control (Administrator / Investor)
- Logout functionality

### 💰 Investment Management
- Register investments
- Delete investments
- Automatic calculation of total invested amount
- Investment processing using queue (FIFO)

### 📊 Financial Instrument Management
- Add instruments (Administrator)
- Remove instruments (Administrator)
- Dynamic table display
- Automatic ID generation

### 🕓 Event History
- Global system event logging
- Investor-specific history tracking

---

## 🧠 Data Structures Used

| Structure | Purpose |
|-----------|----------|
| `ArrayList` | Store instruments and investments |
| `Queue (LinkedList)` | Process investments |
| `Binary Tree` | Organize financial instruments |
| `JTable` | Display data visually |
| `HashMap` *(used in other projects)* | Efficient key-based management |

---

## 🏗️ Project Architecture

SistemaInversiones
│
├── Usuario (Abstract Class)
│ ├── Administrador
│ └── Inversionista
│
├── InstrumentoFinanciero
├── Inversion
├── Portafolio
├── Historial
├── ArbolBinario
└── Ventana (Graphical Interface - Swing)


---

## 🖥️ Graphical User Interface

Built using **Java Swing**, includes:

- Login panel
- Investment panel
- Portfolio visualization
- Administrative instrument management
- Dynamic tables with automatic updates

---

## 🔐 System Roles

### 👨‍💼 Administrator
- Logs in with predefined credentials
- Can add and remove instruments
- Full system access

### 👨‍💻 Investor
- Automatically registers if not existing
- Can create investments
- Can remove investments
- Views portfolio and total invested amount

---

## 📦 Technologies Used

- Java
- Java Swing
- Object-Oriented Programming (OOP)
- Data Structures
- Client–System model

---

## 🎯 Academic Objectives

This project demonstrates:

- Practical OOP implementation
- Use of dynamic data structures
- Role management and authentication
- Separation of responsibilities
- Modular design
- GUI event handling

---

## 📌 Future Improvements

- Data persistence with files or database
- Password encryption
- Full binary tree integration
- More robust validations
- MVC pattern implementation
- Report export functionality

---

## 👨‍💻 Author

**Dereck Proaño**  
Software Engineering Student  
Academic Project – 2025

---

⭐ If you find this project interesting, feel free to star the repository.

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
Proyecto académico – 2025

---

⭐ Si te interesa el proyecto, puedes dejar una estrella en el repositorio.
