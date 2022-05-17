package by.paliakou.mathOperations;

import org.springframework.stereotype.Component;

@Component
public class Addition implements MathOperation {

    @Override
    public double operation(double num1, double num2) {
        return num1 + num2;
    }
}
