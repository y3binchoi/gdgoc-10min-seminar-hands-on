package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.ok("✅ 정상 응답: /users");
    }

    @GetMapping("/slow")
    public ResponseEntity<String> getSlowResponse() throws InterruptedException {
        Thread.sleep(3000); // 일부러 3초 지연
        return ResponseEntity.ok("🐢 느린 응답: /users/slow");
    }

    @GetMapping("/error")
    public ResponseEntity<String> getError() {
        throw new IllegalStateException("🔥 고의적 에러 발생: /users/error");
    }
}
