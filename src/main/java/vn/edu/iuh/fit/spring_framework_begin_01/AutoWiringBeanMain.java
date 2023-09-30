package vn.edu.iuh.fit.spring_framework_begin_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.edu.iuh.fit.spring_framework_begin_01.models.Department;

import java.util.ArrayList;
import java.util.List;

public class AutoWiringBeanMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AutoWiringBeans.xml");
        //Print out the list of departments
        List<Department> departments = new ArrayList<>();
        departments.add(context.getBean("dept01", Department.class));
        departments.add(context.getBean("dept02", Department.class));
        departments.add(context.getBean("dept03", Department.class));
        departments.add(context.getBean("dept04", Department.class));


    }
}
