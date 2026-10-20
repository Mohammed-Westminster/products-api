package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadURL;
    private double FileSizeMB;
    public DigitalProduct(){}
    public DigitalProduct(Long id, String name, double Price, String downloadURL, double FileSizeMB ){
        super(id,name,Price);
        this.downloadURL = downloadURL;
        this.FileSizeMB = FileSizeMB;

    }
    public String getDownloadURL(){
        return downloadURL;
    }
    public double getFileSizeMB(){
        return FileSizeMB;
    }
}
