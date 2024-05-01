public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Stephen", "Hawking");
        System.out.println("author1.getSecondName() = " + author1.getSecondName());
        Book book1 = new Book("Black Tower", author1, 2004);
        Book book2 = new Book("Black Holes", author2, 2016);
        Book book3 = new Book("Black Holes", author2, 2014);
        System.out.println(book1);
        System.out.println(book2);
        book1.setPublishingYear(2020);
        System.out.println(book1);
        System.out.println(author1.equals(author1));
        System.out.println(book2.equals(book3));

    }
}