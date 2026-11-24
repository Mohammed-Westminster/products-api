package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements  Discountable{
    private String downloadURL;
    private double FileSizeMB;
    private double discountedPrice;
    public DigitalProduct(){}
    public DigitalProduct(Long id, String name, double Price, String downloadURL, double FileSizeMB ){
        super(id,name,Price);
        this.downloadURL = downloadURL;
        this.FileSizeMB = FileSizeMB;
        this.discountedPrice = Price;

    }
    @Override
    public String getSummary() {
// getName(), not name — name is private to Product.
        return "Digital: " + getName()
                + " | Download: " + downloadURL;
    }
    @Override
    public void applyDiscount(double rate) {
// Nothing is shipped, so the full rate applies.
        this.discountedPrice = getPrice() * (1 - rate);
    }
    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
    public String getDownloadURL(){
        return downloadURL;
    }
    public double getFileSizeMB(){
        return FileSizeMB;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadURL = downloadUrl;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.FileSizeMB = fileSizeMB;
    }
}
