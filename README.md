# Movie Catalog REST API

## Overview
This project is a simple Java Spring Boot backend application that provides
RESTful APIs to manage a collection of movies.

The application is developed as part of an internship assignment to demonstrate:
- REST API design
- Clean code structure
- Input validation
- In-memory data storage
- Basic deployment

As per the assignment requirements, the application uses **in-memory storage
(ArrayList)** instead of a database.

---

## Tech Stack
- Java
- Spring Boot
- Maven
- REST API
- In-memory storage (ArrayList)

---

## Project Structure
com.example.moviecatalog
│
├── controller → Handles HTTP requests
├── service → Contains business logic
├── repository → Manages in-memory data storage
├── model → Defines Movie data model
├── exception → Handles application exceptions
│
└── MoviecatalogApplication.java

---

## How to Run the Application

### Prerequisites
- Java 17 or Java 21
- Maven installed

### Steps
1. Clone the repository:
   git clone https://github.com/
   <your-username>/moviecatalog.git
2. Navigate to the project directory:
   cd moviecatalog
3. Run the application:
   mvn spring-boot:run
4. The application will start on:
      http://localhost:8080

---

## API Endpoints

### 1. Add a Movie
**POST** `/api/movies`

#### Request Body
```json
{
"name": "Inception",
"description": "Sci-fi thriller",
"genre": "Sci-Fi",
"releaseYear": 2010
}
```

Response

Status: 201 CREATED

Returns the saved movie with an auto-generated ID

2. Get Movie by ID

**GET** `/api/movies/{id}`
Response

Status: 200 OK

Returns movie details in JSON format

### Validation & Error Handling

Input validation is implemented using Bean Validation annotations

Backend ensures required fields are present and valid

Proper HTTP status codes are returned:

400 Bad Request → Validation errors

404 Not Found → Movie not found

Example validation error response:

```
{
"name": "Movie name is required",
"genre": "Genre is required"
}
```

Data Storage

No database is used

Movies are stored in-memory using an ArrayList

Data is lost when the application restarts

This approach is used intentionally to match the assignment requirements.

### Deployment

The application is deployed on Render, which supports Java Spring Boot
backend services.

Live Application URL:
https://<your-app-name>.onrender.com

Example API:
POST https://<your-app-name>.onrender.com/api/movies