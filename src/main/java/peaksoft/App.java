package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-cor.xml", User.class);

        User user = applicationContext.getBean("User",User.class);
        System.out.println(user);
    }
}
