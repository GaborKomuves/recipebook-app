# Recipe Book App

A simple web-based Recipe Book application built with **Spring Boot** and the **Model-View-Controller (MVC) pattern**. This app allows users to manage recipes through a REST API.

## Features
- Add new recipes
- Retrieve all recipes
- Retrieve a recipe by ID
- Update existing recipes
- Delete recipes

## Tech Stack
- **Backend:** Java, Spring Boot
- **Frontend:** HTML, CSS, JavaScript (if applicable)
- **Database:** H2 (or PostgreSQL if configured)

## Installation

### Prerequisites
Ensure you have the following installed:
- Java 17+ (or compatible version)
- Maven
- PostgreSQL (optional, if not using H2 database)

### Clone the Repository
```bash
 git clone https://github.com/GaborKomuves/recipebook-app.git
 cd recipebook-app
```

### Build and Run the Application
```bash
 mvn clean install
 mvn spring-boot:run
```

### Access the Application
- API endpoints: `http://localhost:8080/api/recipes`
- (Optional) If there is a frontend: `http://localhost:8080`

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| **GET** | `/api/recipes` | Get all recipes |
| **GET** | `/api/recipes/{id}` | Get a recipe by ID |
| **POST** | `/api/recipes` | Add a new recipe |
| **PUT** | `/api/recipes/{id}` | Update an existing recipe |
| **DELETE** | `/api/recipes/{id}` | Delete a recipe |

### Sample Request (Add Recipe)
```json
POST /api/recipes
Content-Type: application/json

{
  "title": "Chocolate Cake",
  "ingredients": "Flour, Sugar, Cocoa, Eggs, Butter",
  "instructions": "Mix and bake at 180°C for 30 mins"
}
```

## Database Configuration
The application can run with an H2 in-memory database by default. If using PostgreSQL, update `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/recipebook
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Future Improvements
- User authentication and roles
- Image upload support for recipes
- UI enhancements (React/Angular frontend)

## Contributing
Feel free to submit pull requests or issues on [GitHub](https://github.com/GaborKomuves/recipebook-app).

## License
MIT License

