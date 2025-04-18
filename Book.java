public class Book {

    int bookId;
    String title;
    String author;
    String category;
    boolean availability;

    public Book(int bookId, String title, String author, String category, boolean availability) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", availability=" + availability +
                '}';
    }
}
