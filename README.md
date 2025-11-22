<div align="center">

[**🇺🇸 English**](#english) | [**🇧🇷 Português**](#portuguese)

</div>

---

<div id="english"></div>

# 📦 JavaFX JDBC - Seller Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-4285F4?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)

A complete Desktop system for managing Sellers and Departments. The project uses the **MVC (Model-View-Controller)** pattern and **DAO (Data Access Object)**, with data persistence via **JDBC** in a MySQL database.

## 🎨 Layout & Interface

The project features a modern and clean graphical interface.

| Department Screen | Seller Form |
|:---:|:---:|
| <img width="947" height="566" alt="Department Screen" src="https://github.com/user-attachments/assets/8c325e69-0d73-411d-8f25-042dfe827519" /> | <img width="947" height="566" alt="Seller Form" src="https://github.com/user-attachments/assets/852b15c4-eebd-43b2-bf89-15c8ac1edce4" /> |

## ✨ Features

- **Department Management:**
  - Complete listing in a stylized table.
  - Register, Edit, and Remove departments.
- **Seller Management:**
  - Listing with responsive columns and alternating rows (Zebra striping).
  - Complete form (Name, Email, Birth Date, Base Salary).
  - Seller association to a Department via dynamic `ComboBox`.
- **Modern Interface:**
  - Dedicated `styles.css` file.
  - Buttons with *hover* states (green for save, red for cancel).
  - Custom styled `DatePicker` and `ComboBox`.
  - Error handling with visual red alert messages.

## 🛠 Technologies Used

- **Java 11+** (Logic and Business Rules)
- **JavaFX** (Desktop Frontend)
- **CSS** (UI Styling)
- **JDBC** (Database Connection)
- **MySQL** (Relational Database)

## 🚀 How to Run

### Prerequisites
* Java JDK 11 or higher installed.
* MySQL Server running.
* IDE (IntelliJ, Eclipse, or NetBeans).

### 1. Database Setup
Execute the SQL script below in your MySQL to create the structure:

```sql
CREATE DATABASE coursejdbc;
USE coursejdbc;

CREATE TABLE department (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE seller (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) NOT NULL,
  Email varchar(100) NOT NULL,
  BirthDate datetime NOT NULL,
  BaseSalary double NOT NULL,
  DepartmentId int(11) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartmentId) REFERENCES department (Id)
);

INSERT INTO department (Name) VALUES ('Computers'), ('Electronics'), ('Fashion');

INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES 
('Bob Brown','bob@gmail.com','1998-04-21 00:00:00',1000,1),
('Maria Green','maria@gmail.com','1979-12-31 00:00:00',3500,2);
````

### 2\. Connection Setup

Locate the `db.properties` file in the project root (or in `src`) and update it with your credentials:

```properties
user=your_mysql_user
password=your_mysql_password
dburl=jdbc:mysql://localhost:3306/coursejdbc?useSSL=false&serverTimezone=UTC
```

### 3\. Running

1.  Clone the repository:
    ```bash
    git clone [https://github.com/WarlenSilvaa7/JavaFX-JDBC.git](https://github.com/WarlenSilvaa7/JavaFX-JDBC.git)
    ```
2.  Open the project in your IDE.
3.  Run the main class `Main`.

## 🤝 Contribution

Contributions are welcome\! Feel free to open issues or submit pull requests.

<br>

---

<div id="portuguese"></div>

# 📦 JavaFX JDBC - Sistema de Gestão de Vendedores

Um sistema Desktop completo para gerenciamento de Vendedores e Departamentos. O projeto utiliza o padrão **MVC (Model-View-Controller)** e **DAO (Data Access Object)**, com persistência de dados via **JDBC** em banco MySQL.

## 🎨 Layout & Interface

O projeto conta com uma interface gráfica moderna e limpa.

| Tela de Departamentos | Formulário de Vendedores |
|:---:|:---:|
| <img width="947" height="566" alt="Department Screen" src="https://github.com/user-attachments/assets/8c325e69-0d73-411d-8f25-042dfe827519" /> | <img width="947" height="566" alt="Seller Form" src="https://github.com/user-attachments/assets/852b15c4-eebd-43b2-bf89-15c8ac1edce4" /> |

## ✨ Funcionalidades

  - **Gestão de Departamentos:**
      - Listagem completa em tabela estilizada.
      - Cadastro, Edição e Remoção de departamentos.
  - **Gestão de Vendedores:**
      - Listagem com colunas responsivas e listras alternadas (Zebra).
      - Formulário completo (Nome, Email, Data de Nascimento, Salário Base).
      - Associação de Vendedor a Departamento via `ComboBox` dinâmico.
  - **Interface Moderna:**
      - Arquivo `styles.css` dedicado.
      - Botões com estados de *hover* (verde para salvar, vermelho para cancelar).
      - Campos `DatePicker` e `ComboBox` personalizados.
      - Tratamento de erros com mensagens visuais em vermelho.

## 🛠 Tecnologias Utilizadas

  - **Java 11+** (Lógica e Regras de Negócio)
  - **JavaFX** (Frontend Desktop)
  - **CSS** (Estilização da UI)
  - **JDBC** (Conexão com Banco de Dados)
  - **MySQL** (Banco de Dados Relacional)

## 🚀 Como rodar o projeto

### Pré-requisitos

  * Java JDK 11 ou superior instalado.
  * MySQL Server rodando.
  * IDE (IntelliJ, Eclipse ou NetBeans).

### 1\. Configuração do Banco de Dados

Execute o script SQL abaixo no seu MySQL para criar a estrutura:

```sql
CREATE DATABASE coursejdbc;
USE coursejdbc;

CREATE TABLE department (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE seller (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) NOT NULL,
  Email varchar(100) NOT NULL,
  BirthDate datetime NOT NULL,
  BaseSalary double NOT NULL,
  DepartmentId int(11) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartmentId) REFERENCES department (Id)
);

INSERT INTO department (Name) VALUES ('Computers'), ('Electronics'), ('Fashion');

INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES 
('Bob Brown','bob@gmail.com','1998-04-21 00:00:00',1000,1),
('Maria Green','maria@gmail.com','1979-12-31 00:00:00',3500,2);
```

### 2\. Configuração da Conexão

Localize o arquivo `db.properties` na raiz do projeto (ou em `src`) e atualize com suas credenciais:

```properties
user=seu_usuario_mysql
password=sua_senha_mysql
dburl=jdbc:mysql://localhost:3306/coursejdbc?useSSL=false&serverTimezone=UTC
```

### 3\. Executando

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/WarlenSilvaa7/JavaFX-JDBC.git](https://github.com/WarlenSilvaa7/JavaFX-JDBC.git)
    ```
2.  Abra o projeto na sua IDE.
3.  Execute a classe principal `Main`.

## 🤝 Contribuição

Contribuições são bem-vindas\! Sinta-se à vontade para abrir issues ou enviar pull requests.

-----

*Projeto desenvolvido para fins de estudo em Java e JavaFX.*
