package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogTestComponent {

    private static final Logger log = LoggerFactory.getLogger(LogTestComponent.class);

    @PostConstruct
    public void logTest() {
        log.info("✅ Loki 수집 확인용 테스트 로그");
    }
}
