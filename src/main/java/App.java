import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == bean1);


        Cat beanC1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanC1.getVoice());

        Cat beanC2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanC1 == beanC2);

    }
}