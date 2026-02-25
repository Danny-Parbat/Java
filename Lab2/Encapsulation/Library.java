public class Library {
    private String title;
    private String author;
    private String date;

    public void setTitle(String title) {
        this.title = title;
    };

    public void setAuthor(String author) {
        this.author = author;
    };

    public void setPublicationDate(String date) {
        this.date = date;
    };

    public String getTitle() {
        return title;
    };

    public String getAuthor() {
        return author;
    };

    public String getPublicationDate() {
        return date;
    };

}

class Main1 {
    public static void main(String[] args) {
        Library book1 = new Library();
        book1.setAuthor("JamesBond");
        book1.setTitle("AtomicHabits");
        book1.setPublicationDate("2008-04-20");
        System.out.println(
                " Book Title: " + book1.getTitle() + "," +" Author: " + book1.getAuthor() + "," +" Publication date : " + book1.getPublicationDate());
    }
}