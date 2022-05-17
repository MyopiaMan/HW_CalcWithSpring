package by.paliakou.service;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {

    public void writeMessage(String message){
        System.out.println(message);
    }
    public void writeDoubleMessage(double message){
        System.out.println(message);
    }
}
