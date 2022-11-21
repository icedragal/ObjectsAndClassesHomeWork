public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name,  Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author.getName() +" " + author.getSurname();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
