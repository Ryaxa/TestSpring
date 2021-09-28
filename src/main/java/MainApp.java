import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("hello");
        helloWorld.setName("ars");
        HelloWorld helloWorld1 = (HelloWorld) context.getBean("hello");
        System.out.println(helloWorld1.getName());
    }
}
