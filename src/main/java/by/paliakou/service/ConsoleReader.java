package by.paliakou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {

    @Autowired
    private Scanner scanner;

    // если без @Autowired
//    public ConsoleReader(Scanner scanner){
//        this.scanner = scanner;
//    }

    public String readString(){
        return scanner.next();
    }

    public int readInt(){
        return scanner.nextInt();
    }

    public double readDouble(){
        return scanner.nextDouble();
    }

}
