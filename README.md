# Spring Boot Metrics Dashboard 📊

A Spring Boot application demonstrating metrics collection and visualization using Spring Actuator, Prometheus, and Grafana.

## Features 🚀

- Custom health endpoint with timing metrics
- Prometheus metrics integration
- Grafana dashboards
- Docker Compose setup
- Automated health checks

## Prerequisites 📋

- Java 21
- Docker & Docker Compose
- Maven
- cURL (for health checks)
- jq (for pretty-printing JSON)

## Quick Start 🏃‍♂️

1. Build the application:
```bash
mvn clean package
```

2. Start the monitoring stack:
```bash
docker-compose up -d
```

3. Run the Spring Boot app:
```bash
mvn clean package && mvn spring-boot:run
```

4. Run health checks:
```bash
./health-check.sh
```

## Endpoints 🛣️

- Application: `http://localhost:8080`
    - `/custom-health` - Custom health status
    - `/actuator/health` - Spring Boot health info
    - `/actuator/prometheus` - Prometheus metrics
- Monitoring:
    - Prometheus: `http://localhost:9090`
    - Grafana: `http://localhost:3000` (admin/admin)

## Metrics Configuration ⚙️

The application exposes metrics through:

- Spring Actuator endpoints
- Custom `@Timed` annotations
- Micrometer registry
- Prometheus scraping (15s interval)

## Docker Services 🐳

- **Prometheus**
    - Metrics collection and storage
    - Configuration in `src/main/resources/prometheus.yml`
- **Grafana**
    - Metrics visualization
    - Persistent storage volume
    - Light theme by default