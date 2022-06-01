package BooksStoreOOP;

public class EBook extends Book{

    String downloadURL;

    public EBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable, String downloadURL) {
        super(bookName, authorName, id, priceInUSD, isAvailable);
        this.downloadURL = downloadURL;

    }

    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;

    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("URL "+ downloadURL);
    }
}
