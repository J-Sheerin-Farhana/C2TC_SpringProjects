//To demonstrate dependency injection for Library and Book beans using Spring
package org.tnsif.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");

        // Get Library bean
        Library library = (Library) context.getBean("library");

        // Display books
        library.displayBooks();
    }
}
