package vn.edu.iuh.fit.spring_framework_begin_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.edu.iuh.fit.spring_framework_begin_01.models.Person;
import vn.edu.iuh.fit.spring_framework_begin_01.models.Student;

public class XMLBeanMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //Test bean st01
//        Student st1 = context.getBean("st01", Student.class);
//        System.out.println("Infomation student: "+ st1);

        //Test bean st02
//        Student st2 = context.getBean("st02", Student.class);
//        System.out.println("Infomation: "+ st2);

        //Test bean st03
//        Student st3 = context.getBean("st03", Student.class);
//        System.out.println("Infomation: "+ st3);

        //Test bean person
//       Person p01 = context.getBean("person", Person.class);
//        System.out.printf("Infomation: "+ p01);

        //Test bean my properties
        Student st04 = context.getBean("st04", Student.class);
        System.out.println("Information: "+st04);
    }
}
