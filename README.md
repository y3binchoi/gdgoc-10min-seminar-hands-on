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

아키텍처 구조: 

<img width="1100" alt="image" src="https://github.com/user-attachments/assets/98da9713-5ec9-4058-9b22-71c04c27b6a6" />


## 프로젝트 구조

```bash
gdgoc-10min-seminar-hands-on
├── app
│   └── logs
├── demo
│   ├── build
│   │   ├── classes
│   │   ├── generated
│   │   ├── libs
│   │   ├── reports
│   │   ├── resolvedMainClassName
│   │   ├── resources
│   │   ├── test-results
│   │   └── tmp
│   ├── build.gradle
│   ├── demo
│   │   └── logs
│   ├── Dockerfile
│   ├── gradle
│   │   └── wrapper
│   ├── gradlew
│   ├── gradlew.bat
│   ├── HELP.md
│   ├── logs
│   │   └── app.log
│   ├── settings.gradle
│   └── src
│       ├── main
│       └── test
├── docker-compose.yml
├── generate-traffic.sh
├── grafana
│   ├── dashboards
│   │   ├── sample-dashboard.json
│   │   └── simple-dashboard.json
│   └── provisioning
│       ├── dashboards
│       └── datasources
├── loki
│   └── config.yml
├── prometheus
│   └── prometheus.yml
├── promtail
│   └── config.yml
└── README.md
```

---

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

### 🎲 랜덤 트래픽 만들기 

```bash
chmod +x generate-traffic.sh # 맥 기준
./generate-traffic.sh {숫자} # 입력한 숫자 만큼 요청 보냄. 기본 50
```

## 🧹 종료

```bash
docker compose down
```
