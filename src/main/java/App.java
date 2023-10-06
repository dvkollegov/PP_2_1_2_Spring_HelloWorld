import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldOne.getMessage());
        HelloWorld helloWorldTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldOne == helloWorldTwo);

        Cat catOne = (Cat) applicationContext.getBean("cat");
        Cat catTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(catOne == catTwo);
    }
}