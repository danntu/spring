package javatpoint.ci_with_dependobject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("src/test/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee employee = (Employee) factory.getBean("empwithdepobject");
        employee.show();
    }
}
