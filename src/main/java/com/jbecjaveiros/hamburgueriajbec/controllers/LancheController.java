package com.jbecjaveiros.hamburgueriajbec.controllers;

import com.jbecjaveiros.hamburgueriajbec.dto.LancheRequest;
import com.jbecjaveiros.hamburgueriajbec.dto.LancheResponse;
import com.jbecjaveiros.hamburgueriajbec.services.LancheService;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lanche")

public class LancheController {

    @Autowired
    private LancheService lancheService;

    @PostMapping
    public ResponseEntity<LancheResponse> create(@RequestBody LancheRequest lancheRequest) {
        LancheResponse lancheResponse = lancheService.create(lancheRequest);
        return ResponseEntity.ok().body(lancheResponse);
    }
}
