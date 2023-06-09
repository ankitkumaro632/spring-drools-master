package com.javatechie.spring.drools.api.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/arithmetic")
public class ArithmeticController {

    @Autowired
    private ArithmeticService arithmeticService;

    @PostMapping("/sum")
    public ResponseEntity<Integer> calculateSum(@RequestBody Calculator sumOperationDTO) {
        int sum = arithmeticService.calculateSum(sumOperationDTO.getOperand1(), sumOperationDTO.getOperand2());
        return ResponseEntity.ok(sum);
    }

    @PostMapping("/difference")
    public ResponseEntity<Integer> calculateDifference(@RequestBody Calculator sumOperationDTO) {
        int difference = arithmeticService.calculateDifference(sumOperationDTO.getOperand1(), sumOperationDTO.getOperand2());
        return ResponseEntity.ok(difference);
    }

    @PostMapping("/product")
    public ResponseEntity<Integer> calculateProduct(@RequestBody Calculator sumOperationDTO) {
        int product = arithmeticService.calculateProduct(sumOperationDTO.getOperand1(), sumOperationDTO.getOperand2());
        return ResponseEntity.ok(product);
    }

    @PostMapping("/division")
    public ResponseEntity<Double> calculateDivision(@RequestBody Calculator sumOperationDTO) {
        double division = arithmeticService.calculateDivision(sumOperationDTO.getOperand1(), sumOperationDTO.getOperand2());
        return ResponseEntity.ok(division);
    }
}
