package BooksStoreOOP;

public abstract class Book {
    String bookName;
    String authorName;
    int id;
    double priceInUSD;
    boolean isAvailable;
    String euro = "EUR";
    String ruble = "RUB";

    public Book(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.id = id;
        this.priceInUSD = priceInUSD;
        this.isAvailable = isAvailable;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPriceInUSD() {
        return priceInUSD;
    }

    public void setPriceInUSD(double priceInUSD) {
        this.priceInUSD = priceInUSD;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double convertPrice(String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
        double priceAfterConvertion = priceInUSD * rate;
        return priceAfterConvertion;
    }

    public void printBookDetails() {
        System.out.println("*************");
        System.out.println("Book name is " + bookName);
        System.out.println("Book ID is " + id);
        System.out.println("Book price: " + priceInUSD + " USD / " + convertPrice(euro) + " EUR/" + convertPrice(ruble) + "RUB");
        System.out.println("Book is available: " + isAvailable);
    }

}
