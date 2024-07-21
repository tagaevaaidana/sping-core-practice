package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-core.xml", User.class);

        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
