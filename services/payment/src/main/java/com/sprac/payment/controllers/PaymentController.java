package com.sprac.payment.controllers;

import com.sprac.payment.dtos.PaymentRequest;
import com.sprac.payment.services.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService service;

    @PostMapping
    public ResponseEntity<String> createPayment(@RequestBody @Valid PaymentRequest request){

        return ResponseEntity.ok("Payment is done with ID::"+ service.createPayment(request));

    }

}
