# FinTech Application

A cloud-based wallet system developed using Java and Spring Boot. This project includes data validation, REST APIs, and integration with MySQL, secured with JWT authentication. The application generates bank statements and sends them via email.

## Features

- **User Authentication**: Secure login and registration using JWT.
- **Wallet Management**: Users can manage their wallets, add or withdraw funds, and view transaction history.
- **Bank Statement Generation**: Generates PDF bank statements for users, which are then sent to their email addresses.
- **REST API**: Well-defined endpoints for user operations, transaction management, and wallet interactions.
- **MySQL Integration**: All data is stored securely in a MySQL database.
- **Email Service**: Automatically sends bank statements to users via email.


## Getting Started

### Prerequisites

- Java 22 or higher
- Maven 3.8+
- MySQL 8.0+
- IDE (IntelliJ, Eclipse, etc.)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/fintech-application.git

2. Navigate to the project directory:

   ```bash
   cd fintech-application

3. Configure the application.properties file:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/fintech_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword

4. Run the application:
   ```bash
   mvn spring-boot:run
   
## API Documentation
Swagger is integrated for API documentation. Once the application is running, you can access the documentation at:
```bash
http://localhost:8080/swagger-ui.html



