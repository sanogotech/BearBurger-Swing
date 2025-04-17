<p align= "center">
    <img src="https://raofin.github.io/r/img/BearBurger/nav-logo.png" title="Logo" alt="Logo" width="500px">
    <br/>
    <b>BearBurger-Swing</b> is a food management system, built using Java, Java Swing, Java Spring, JDBC Template, and Maven.
</p>

## Features
Customers can create accounts, log in to the system, browse foods, make purchases, and do many other things. There are also various features available for administrators. The application is essentially separated into two roles-
* **Customer:**
    * Login
    * Registration
    * Profile view and modify
    * Browse and search foods
    * Add foods to cart
    * Purchase foods
    * Payment with credit card
* **Administrator:**
    * Add and remove users
    * Modify user details
    * View user list
    * Add foods

## Tools & Technologies
* Java, JDBC Template, Maven
* **Frameworks:** Java Swing & Java Spring
* **Database:** MySQL
* **IDE:** IntelliJ IDEA

## How to Run
* **Executable JAR:**
    1. Execute the [SQL queries](src/main/resources/database/app.sql) in your MySQL server
    2. Download and run [BearBurger-Swing.jar](https://github.com/Raofin/BearBurger-Swing/releases/download/v1.0.0/BearBurger-Swing.jar)
* **Source Code:**
    1. Execute the [SQL queries](src/main/resources/database/app.sql) in your MySQL server.
    2. Clone the repository and open it with any Java IDE, like **IntelliJ IDEA**.
    3. Maven should automatically download the required dependencies. Wait till the process is completed.
    4. Make sure all the dependencies are properly downloaded **(Important!)**.
    5. If you have a different MySQL username, and password or running it on a different port, you can modify the project datasource configurations from `src\main\resources\application-context.xml`.
    6. Run the project using `src\main\java\org\apwj\bearburger\App.java`.

## Screenshots
<p align= "center">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(1).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(2).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(3).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(4).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(5).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(6).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(7).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(8).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(9).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(10).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(11).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(12).png" width="400">
    <img src="https://raofin.github.io/r/img/BearBurger-Swing/(13).png" width="400">
<p/>


Voici un **README complet** pour ton projet **BearBurger**, prêt à être placé dans un fichier `README.md` à la racine du projet :

---

```markdown
# 🐻 BearBurger

> Une application de gestion de restaurant moderne, utilisant Java, Swing, Spring et FlatLaf pour une expérience utilisateur élégante et performante.

## 🧾 Description

**BearBurger** est une application de gestion de restaurant écrite en Java, avec une interface utilisateur soignée basée sur `FlatLaf`. Elle propose des fonctionnalités de gestion de menus, de commandes et de bases de données avec `Spring JDBC`, le tout supporté par `MySQL` ou `H2` pour le stockage.

---

## ✨ Fonctionnalités

- Interface graphique moderne avec **FlatLaf** (thème IntelliJ One Dark)
- Gestion des menus et commandes
- Intégration base de données via **Spring JDBC**
- Compatible avec **MySQL** ou **H2** (runtime embeddable)
- Tests unitaires avec **JUnit**
- Interface multithème (support FlatLaf IntelliJ Themes)
- Prêt pour intégration et déploiement via un `.jar` autonome avec dépendances

---

## 🛠️ Technologies utilisées

| Composant          | Version    | Rôle                          |
|--------------------|------------|-------------------------------|
| Java               | 8+         | Langage principal             |
| Maven              | 3+         | Gestion de projet             |
| Spring JDBC        | 5.3.20     | Accès aux données             |
| FlatLaf            | 2.4        | Look & Feel                   |
| H2 Database        | 2.2.224    | Base embarquée (développement)|
| MySQL Connector/J  | 8.0.29     | Base de production            |
| JUnit              | 4.13.2     | Tests unitaires               |

---

## 📦 Structure du projet

```
BearBurger/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/apwj/bearburger/
│   │   │       ├── App.java          # Classe principale
│   │   │       └── ...               # Autres classes (UI, DAO, services...)
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/...                  # Tests unitaires JUnit
├── pom.xml
└── README.md
```

---

## ▶️ Lancer l’application

### 1. Compilation et création du JAR exécutable :

```bash
mvn clean compile assembly:single
```

### 2. Exécution :

```bash
java -jar target/BearBurger-1.0-SNAPSHOT-jar-with-dependencies.jar
```

---

## ⚙️ Configuration de la base de données

Par défaut, l'application peut utiliser H2 pour les tests et MySQL pour la production.

### Exemple `application.properties` (dans `src/main/resources/`) :

```properties
# H2 - Dev/Test
spring.datasource.url=jdbc:h2:./data/bearburger
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# MySQL - Production
# spring.datasource.url=jdbc:mysql://localhost:3306/bearburger
# spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
# spring.datasource.username=root
# spring.datasource.password=yourpassword
```

---

## ✅ Tests

Lancer les tests unitaires avec :

```bash
mvn test
```

---

## 🧠 Auteurs & Contributeurs

- **Ton Nom / Équipe**
- Contact : [email@example.com]

---

## 📄 Licence

Projet sous licence MIT ou personnalisée – à définir.

---

## 🌐 Ressources

- [FlatLaf - Look & Feel moderne pour Swing](https://www.formdev.com/flatlaf/)
- [Spring JDBC Docs](https://docs.spring.io/spring-framework/docs/current/reference/html/data-access.html#jdbc)
- [H2 Database](https://www.h2database.com/html/main.html)

---




## License
This project is licensed under the [MIT License](LICENSE.md).
