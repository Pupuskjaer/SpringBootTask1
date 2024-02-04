package pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String HelloToCalc() {
        return calculatorService.HelloToCalculator();
    }

    @GetMapping("/plus")
    public String addTwoNumbers(@RequestParam("num1") int num1,
                                @RequestParam("num2") int num2) {
        return String.format("%d",calculatorService.addTwoNumbers(num1, num2));
    }

    @GetMapping("/minus")
    public String subTwoNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.format("%d",calculatorService.subTwoNumbers(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiplyTwoNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.format("%d",calculatorService.multiplyTwoNumbers(num1, num2));
    }

    @GetMapping("/divide")
    public String divideTwoNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.format("%d",calculatorService.divideTwoNumbers(num1, num2));
    }

}



