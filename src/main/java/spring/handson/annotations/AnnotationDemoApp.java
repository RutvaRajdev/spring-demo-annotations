package spring.handson.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AnnotationDemoApp {

    public static void main(String[] args) throws IOException {
        // Read spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // Call a method on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Close context
        context.close();
    }
}
