package uk.ac.westminster.products_api;
// A PhysicalProduct is a Product because it has weight and dimensions rather than file sizes.
// Services could be something provided that would neither have physical attributes nor digital attributes.
public class PhysicalProduct extends Product implements Discountable{
    private double WeightKg;
    private String dimensions;
    private double discountedPrice;
    public PhysicalProduct(){}
    public PhysicalProduct(Long id, String name, double Price, String dimensions, double WeightKg ){
        super(id,name,Price);
        this.WeightKg = WeightKg;
        this.dimensions = dimensions;
        this.discountedPrice = Price;

    }
    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | " + WeightKg + "kg";
    }
    @Override
    public void applyDiscount(double rate) {
// A physical item still has to be shipped, and shipping
// is never discounted — so cap the reduction at 20%.
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }
    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
    public String getDimensions(){
        return dimensions;
    }
    public double getWeightKg(){
        return WeightKg;
    }
    public void setWeightKg(double weightKg) {
        this.WeightKg = weightKg;
    }
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
