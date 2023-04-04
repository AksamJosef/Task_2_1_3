import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanAnotherHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == beanAnotherHelloWorld);

        Cat beanCat = applicationContext.getBean("cat", Cat.class);
        Cat beanAnotherCat = applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat == beanAnotherCat);
//        System.out.println(bean.getMessage());
    }
}