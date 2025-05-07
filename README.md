# 📊 Spring Boot Observability Hands-on

Spring Boot 애플리케이션에서 **로그(Log)** 와 **메트릭(Metric)** 을 수집하고, **Grafana** 대시보드로 시각화하는 실습입니다.  
운영 경험이 없던 개발자가 로그와 지표의 중요성을 이해하고, 작은 실습부터 가시성 확보를 시작할 수 있도록 구성했습니다.

---

## 🧭 목표

- 로그가 어디에 쌓이는지, 어떻게 수집되는지 이해한다.
- HTTP 요청 지연, 에러 발생을 수치로 모니터링한다.
- Grafana를 통해 실시간 대시보드를 구축한다.

---

## 🏗️ 구성

- **Spring Boot 3.x + Java 17**
- **Prometheus**: 메트릭 수집
- **Loki + Promtail**: 로그 수집
- **Grafana**: 대시보드 시각화
- **Docker Compose** 기반 통합 구성

## 🚀 빠른 시작

### 1. 이 저장소를 클론

```bash
git clone https://github.com/YOUR_ID/spring-boot-observability-handson.git
cd spring-boot-observability-handson
```

### 2. 애플리케이션 빌드

```bash
cd demo
./gradlew clean build
cd ..
```

### 3. Docker Compose 실행

```bash
docker compose up --build -d
```

## 실행 완료 후

Spring Boot 앱: http://localhost:8080

Grafana: http://localhost:3000
ID: admin, PW: admin

## 🧹 종료

```bash
docker compose down
```