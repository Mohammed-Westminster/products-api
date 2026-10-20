package uk.ac.westminster.products_api;
// A PhysicalProduct is a Product because it has weight and dimensions rather than file sizes.
// Services could be something provided that would neither have physical attributes nor digital attributes.
public class PhysicalProduct extends Product{
    private double WeightKg;
    private String dimensions;
    public PhysicalProduct(){}
    public PhysicalProduct(Long id, String name, double Price, String dimensions, double WeightKg ){
        super(id,name,Price);
        this.WeightKg = WeightKg;
        this.dimensions = dimensions;

    }
    public String getDimensions(){
        return dimensions;
    }
    public double getWeightKg(){
        return WeightKg;
    }
}
