package javatpoint.fabric_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A) context.getBean("factorymethodA");
        a.msg();
    }
}
