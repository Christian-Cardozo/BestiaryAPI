BestiaryAPI
===========

A Spring Boot API that catalogs mythological and urban creatures worldwide.

* * * * *

Endpoints
---------

-   **GET /creatures** → List all creatures

-   **GET /creatures/{id}** → Get creature by ID

-   **POST /creatures** → Add a new creature

-   **PUT /creatures/{id}** → Update an existing creature

-   **DELETE /creatures/{id}** → Delete a creature

* * * * *

Tech Stack
----------

-   Java 17

-   Spring Boot

-   Spring Data JPA

-   H2 Database

* * * * *

How to Run
----------

Use the Maven wrapper:

./mvnw spring-boot:run

Access the API at:\
<http://localhost:8080/creatures>

* * * * *

Example JSON for POST
---------------------

{\
"name": "Wendigo",\
"origin": "North America",\
"description": "A mythical cannibal spirit from Algonquian folklore.",\
"dangerLevel": 8\
}

* * * * *

H2 Database Console
-------------------

Open in browser:\
<http://localhost:8080/h2-console>

JDBC URL: jdbc:h2:mem:testdb
