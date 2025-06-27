# 🐉 BestiaryAPI

A Spring Boot API that catalogs mythological and urban creatures worldwide.

## 📚 Endpoints

| Method | Endpoint         | Description                      |
|--------|------------------|----------------------------------|
| GET    | /creatures       | List all creatures               |
| GET    | /creatures/{id}  | Get creature by ID               |
| POST   | /creatures       | Add a new creature               |
| PUT    | /creatures/{id}  | Update an existing creature      |
| DELETE | /creatures/{id}  | Delete a creature                |

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database

## 🧪 Run Locally
----------

Use the Maven wrapper:

./mvnw spring-boot:run

Access the API at:\
<http://localhost:8080/creatures>

* * * * *

📖 API Documentation
--------------------

The project includes auto-generated OpenAPI docs using **springdoc-openapi**.

Once the app is running, you can access:

-   **Swagger UI** → <http://localhost:8080/swagger-ui.html>

-   **OpenAPI JSON** → <http://localhost:8080/v3/api-docs>

This allows you to explore and test all endpoints directly from the browser.

📝 Example JSON for POST
---------------------

{\
"name": "Wendigo",\
"origin": "North America",\
"description": "A mythical cannibal spirit from Algonquian folklore.",\
"dangerLevel": 8\
}

* * * * *

💾 H2 Database Console
-------------------

Open in browser:\
<http://localhost:8080/h2-console>

JDBC URL: jdbc:h2:mem:testdb

Enjoy your bestiary! 🔥
