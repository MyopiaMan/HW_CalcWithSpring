package by.paliakou;

import by.paliakou.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {

    @Autowired
    private Calculator calculator;

    public void start(){
        calculator.calculate();
    }
}
