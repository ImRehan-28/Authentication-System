# Authentication System

This repository contains a Spring Boot-based authentication system.

## Project Structure

```
Authentication-System/
└── backend/       ← Maven project root
    ├── .mvn/
    ├── src/
    ├── pom.xml
    ├── mvnw
    └── mvnw.cmd
```

## Building and Running

All Maven commands should be run from the **repository root**, referencing the `backend/` project:

```bash
# Compile
mvn -f backend/pom.xml compile

# Run tests
mvn -f backend/pom.xml test

# Package
mvn -f backend/pom.xml package

# Run the application
mvn -f backend/pom.xml spring-boot:run
```

Alternatively, change into the `backend/` directory and use the Maven wrapper:

```bash
cd backend
./mvnw spring-boot:run
```
