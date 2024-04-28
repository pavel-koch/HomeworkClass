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
        String title = getBookTitle();
        String authors = author.getFirstName() + " " + author.getSecondName();
        int year = getPublishingYear();
        System.out.println(title);
        System.out.println(authors);
        System.out.println(year);
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
