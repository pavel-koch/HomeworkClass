public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Stephen", "Hawking");
        System.out.println("author1.getSecondName() = " + author1.getSecondName());
        Book book1 = new Book("Black Tower", author1, 2004);
        Book book2 = new Book("Black Holes", author2, 2016);
        book2.printBookData();
        book1.printBookData();
        book1.setPublishingYear(2020);
        book1.printBookData();

    }
}