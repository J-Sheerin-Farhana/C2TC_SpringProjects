// To demonstrate dependency injection using Spring framework
package org.tnsif.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("dept.xml");

        // Retrieve the Company bean
        Company company = context.getBean("company", Company.class);

        // Print the company details, including departments and employees
        company.printCompanyDetails();
    }
}
