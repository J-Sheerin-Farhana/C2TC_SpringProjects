package com.tnsif.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tnsif.college.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext var = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Student s = var.getBean("student2", Student.class);
        System.out.println(s);
        s.display();

        Student s1 = var.getBean("student1", Student.class);
        System.out.println(s1);
        s1.display();
        
        Student s2 = var.getBean("student3", Student.class);
        System.out.println(s2);
        s2.display();
    }
}