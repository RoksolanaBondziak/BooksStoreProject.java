package BooksStoreOOP;

public class AudioBook extends Book {

    String format;
    int bitRate;



    String readerName;

    public AudioBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable, String format, int bitRate, String readerName) {
        super(bookName, authorName, id, priceInUSD, isAvailable);
        this.format = format;
        this.bitRate = bitRate;
        this.readerName = readerName;

    }
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Format is " + format);
        System.out.println("Bitrate is " + bitRate);
        System.out.println("Reader " + readerName );
        System.out.println("new line");
    }
}
