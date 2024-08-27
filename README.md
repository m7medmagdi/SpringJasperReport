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
  - `entity/`: Contains data models (e.g., `SampleData`).
- `src/main/resources/`
  - `report.jrxml`: JasperReports template for the report.

## Setup and Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yourusername/your-repository.git

## Usage
1. **Generate and Download the Report::**
      Open Postman or any other HTTP client and send a GET request to the following endpoint:


   ```bash
   http://localhost:8080/api/reports/pdf
  The response will be a PDF file generated from the JasperReports template.


