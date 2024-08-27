# Spring Boot JasperReports Example

## Overview

This project demonstrates how to integrate JasperReports with a Spring Boot application. It provides a simple RESTful API endpoint to generate and download a PDF report using JasperReports.

## Features

- Generates PDF reports using JasperReports
- RESTful API to download the report
- Sample data included for demonstration

## Requirements

- JDK 17 or later
- Maven 3.6 or later
- Spring Boot 3.x
- JasperReports 6.x

## Project Structure

- `src/main/java/com/example/demo/`
  - `controller/`: Contains the REST controller for report generation.
  - `service/`: Contains the service to generate the report.
  - `model/`: Contains data models (e.g., `SampleData`).
- `src/main/resources/`
  - `report.jrxml`: JasperReports template for the report.

## Setup and Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yourusername/your-repository.git
