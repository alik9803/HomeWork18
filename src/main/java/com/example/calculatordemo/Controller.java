package com.example.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Service service;
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/calculator")
    public String welcome() {
        return service.welcome();
    }

    @GetMapping("/calculator/plus")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        return service.add(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        return service.subtract(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return service.divide(num1, num2);
        }
        return "не делиться";
    }
}