import java.time.LocalDate;

public class Book {
    private String bookTitle;
    private Author author;
    private int publishingYear;

    public Book(String bookTitle, Author author, int publishingYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author.toString();
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setPublishingYear(int publishingYear) {
        int date = LocalDate.now().getYear();
        if (publishingYear < 1950 || publishingYear > date) {
            System.out.println("Invalid publishing year:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookTitle + "\n" + author + "\nГод издания: " + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b1 = (Book) other;
        return bookTitle.equals(b1.bookTitle) && author.equals(b1.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(author);
    }


}
