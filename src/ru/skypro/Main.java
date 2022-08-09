package ru.skypro;

class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
}

class Author {
    private String firstAuthorName;
    private String lastAuthorName;

    public Author(String firstAuthorName, String lastAuthorName) {
        this.firstAuthorName = firstAuthorName;
        this.lastAuthorName = lastAuthorName;
    }

    public String getFirstAuthorName() {
        return firstAuthorName;
    }

    public String getLastAuthorName() {
        return lastAuthorName;
    }
}

public class Main {
    public static void main(String[] args) {
	    Author author1 = new Author("Иванов", "Иван");
	    Author author2 = new Author("Васильев", "Вася");

        Book book1 = new Book("Книга один", author1, 2022);
        Book book2 = new Book("Книга два", author2, 2021);
        book2.setPublishingYear(2022);
    }
}
