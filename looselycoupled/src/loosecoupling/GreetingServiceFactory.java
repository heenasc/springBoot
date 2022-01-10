package loosecoupling;

public class GreetingServiceFactory {
    public GreetingService getGreetingService(String language){
        if(language.equals("english")){
            return new EnglishGreetingService();
        }else if(language.equals("french")) {
            return new FrenchGreetingService();
        }else if(language.equals("spanish")){
            return new SpanishGreetingService();
        }else{
            throw new RuntimeException("no greeting service exist for"+language);
        }
    }
}
