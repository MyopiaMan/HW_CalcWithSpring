package by.paliakou;

import by.paliakou.configuration.RootConfiguration;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        Application app = applicationContext.getBean("application", Application.class);
        app.start();
    }
}
