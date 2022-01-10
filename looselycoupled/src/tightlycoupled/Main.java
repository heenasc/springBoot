package tightlycoupled;

public class Main {
    public static void main(String[] args)
    {
        /* the Main class depends on the GreetingService class.
        When you create the object of the GreetingService class directly inside the Main class, this introduces tight coupling between both the classes.*/

        GreetingService greetingService = new GreetingService();
        greetingService.greet("John");
    }
}
