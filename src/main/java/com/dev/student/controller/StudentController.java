package com.dev.student.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class StudentController {

    @GetMapping("/Test")
    public ResponseEntity<Object> testing()
    {

        String maintenancePage = "<html><body><h1>Under Maintenance</h1><p>We'll be back soon!</p></body></html>";
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(maintenancePage);    }
}
