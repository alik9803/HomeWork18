package com.example.calculatordemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;
    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }
    @GetMapping("/plus")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.add(num1, num2);
    }
    @GetMapping("/minus")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.subtract(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
            return calculatorService.divide(num1, num2);
        }
    }