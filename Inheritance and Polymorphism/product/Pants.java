package product;

public class Pants extends Product {

    private int waist;
    private int length;
    
    public Pants(double price, String color, String brand, int waist, int length) {
       //superClass constructor
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Fold pants in half");
    }

    @Override
    public void wear() {
        System.out.println("Wearing my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }
}