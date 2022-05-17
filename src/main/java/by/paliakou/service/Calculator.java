package by.paliakou.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static by.paliakou.service.CalcMessages.*;
import by.paliakou.mathOperations.*;

@Component
public class Calculator {
    @Autowired
    private ConsoleReader consoleReader;

    @Autowired
    private ConsoleWriter consoleWriter;

    public void calculate(){

        boolean isActive = true;
        consoleWriter.writeMessage(calcActivateMessage);

        while (isActive){
            consoleWriter.writeMessage(inputFirstNumberMessage);
            double num1 = consoleReader.readDouble();
            consoleWriter.writeMessage(inputSecondNumberMessage);
            double num2 = consoleReader.readDouble();
            consoleWriter.writeMessage(enumOfMathOperationsMessage);
            int operation = consoleReader.readInt();
            consoleWriter.writeMessage(calcResultMessage);
            switch (operation){
                case 1:// +
                    consoleWriter.writeDoubleMessage(new Addition().operation(num1, num2));
                    break;
                case 2:// -
                    consoleWriter.writeDoubleMessage(new Subtraction().operation(num1, num2));
                    break;
                case 3:// *
                    consoleWriter.writeDoubleMessage(new Multiplication().operation(num1, num2));
                    break;
                case 4:// /
                    consoleWriter.writeDoubleMessage(new Division().operation(num1, num2));
                    break;
                default:
                    consoleWriter.writeMessage(incorrectInputOfMathOperationsMessage);
                    continue;
            }
            System.out.println("Input 0 to exit and any other number to continue calculation");
            int continueCalculation = consoleReader.readInt();
            if (continueCalculation == 0) isActive = false;
        }
        consoleWriter.writeMessage(calcDeactivateMessage);
    }
}
