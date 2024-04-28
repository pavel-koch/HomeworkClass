import java.time.LocalDate;
public class Book {
    private String bookTitle;
    private Author author;
    private int publishingYear;

    public Book (String bookTitle, Author author, int publishingYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public void printBookData() {
        System.out.println(this.bookTitle);
        System.out.println(author.getFirstName() + " " + author.getSecondName());
        System.out.println(this.publishingYear);
        System.out.println();
    }
    public Author getAuthor() {
        return author;
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

}
