// To define a Class representing a Book entity with title and author details
package org.tnsif.springdi;

public class Book {
    // Private fields to store the title and author of the book
    private String title;
    private String author;
    private int bid;

    // Constructor that allows dependency injection for the title and author of the book
    public Book(String title, String author, int bid) {
        this.title = title;  // Sets the book's title
        this.author = author;  // Sets the book's author
        this.bid=bid;
    }

    // Getter method to access the title of the book
    public String getTitle() {
        return title;
    }

    // Getter method to access the author of the book
    public String getAuthor() {
        return author;
    }

    public int getBid() {
		return bid;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bid=" + bid + "]";
	}

	// Override toString method to return the book details in a readable format
   
}
