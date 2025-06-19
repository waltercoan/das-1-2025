package br.univille.app_b.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    //  ******** APPLICAÇÃO BBBBB  ************

    @GetMapping()
    public ResponseEntity index() {
        System.out.println("Hello from App B");
        return ResponseEntity.ok().body("Hello from App B");
    }
}
