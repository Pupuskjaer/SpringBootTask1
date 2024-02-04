package pro.sky.Calculator;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CalculatorService {

    public String HelloToCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public int addTwoNumbers(int num1, int num2) {
        return num1+num2;
    }

    public int subTwoNumbers(int num1, int num2) {
        return num1-num2;
    }

    public int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public int divideTwoNumbers(int num1, int num2) {
        if (num2==0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        else {
            return num1/num2;
        }
    }
}
