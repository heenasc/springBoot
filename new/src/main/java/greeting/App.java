package greeting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("greeting");
        GreetingService greetingService=(GreetingService) context.getBean("englishGreetingService");
        //here we create a bean for EnglishGreetingService hence keep e in small latter,bean is created and stored in  spring container
        //By making use of the object of ApplicationContext, we can take the bean out of the container and then invoke the methods present inside this bean.
        greetingService.greet("Heena");
    }
}

/*In order to create beans, i used the @Component annotation.
and placed this annotation above the class for which i wanted to create the bean.
This annotation tells Spring that it needs to create a bean of this class and put it in the Spring container.
 */