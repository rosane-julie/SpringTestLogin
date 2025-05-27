# SpringTestLogin

A stylish and lightweight Spring Boot login application that uses H2 database for storing user credentials. This app demonstrates core web MVC concepts like user authentication, session handling, error binding, and clean templating with Thymeleaf.

---

## 🚀 Features

- 🔐 User login with email & password
- ✅ Authentication backed by H2 `users` table
- ❌ Logout functionality
- 🧾 Inline error handling with Thymeleaf
- 🖼 Personalized dashboard on successful login
- 🧰 Built using Spring Boot MVC architecture
- 💅 Styled with Spectre.css
- 🧪 H2 Console enabled for development/debugging

---

## 🧰 Tech Stack

| Layer     | Technology                |
|-----------|---------------------------|
| Backend   | Spring Boot 2.7.x         |
| Frontend  | Thymeleaf + Spectre.css   |
| Database  | H2 Embedded (JDBC)        |
| Build     | Maven                     |
| IDE       | VS Code / IntelliJ        |

---

## 🗄 Database

Uses an H2 embedded database with a `users` table:

```sql
CREATE TABLE users (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);
A default user can be preloaded via data.sql:

sql
Copy
Edit
INSERT INTO users (email, password) VALUES ('user@example.com', '1234');
## 📁 Project Structure
pgsql
Copy
Edit
WebDomLogin/
├── controller/         # Handles login logic
├── model/              # User.java model
├── repository/         # UserRepository (Spring Data)
├── templates/          # Thymeleaf: index.html, dashboard.html
│   ├── index.html      # Login form
│   └── dashboard.html  # Post-login dashboard
├── resources/
│   ├── application.properties
│   └── data.sql (optional)
├── DemoApplication.java
├── pom.xml
└── README.md
## ▶️ How to Run
Make sure Java and Maven are installed.

bash
Copy
Edit
# From project root
mvn spring-boot:run
Then open your browser:
📍 http://localhost:9090

## 🔐 Default Login (if using data.sql)
plaintext
Copy
Edit
Email: user@example.com
Password: 1234
## 🔎 H2 Console
Visit:
🔗 http://localhost:9090/h2-console

Default config in application.properties:

properties
Copy
Edit
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:file:./data/mydb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
## 📸 Screenshots
📌 Add screenshots in a /screenshots/ folder and link them here:

markdown
Copy
Edit
### 🔐 Login Page
![Login Page](screenshots/login.png)

### ✅ Dashboard
![Dashboard](screenshots/dashboard.png)
## 📝 License
This project is licensed under the MIT License.

## 🙋‍♀️ Author
Developed by Julie Rosane

