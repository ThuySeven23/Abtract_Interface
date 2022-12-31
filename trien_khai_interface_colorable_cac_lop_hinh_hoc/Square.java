package trien_khai_interface_colorable_cac_lop_hinh_hoc;

public class Square extends Shape{
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color,  boolean filled , double side) {
        super(color , filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public String toString() {
        return "The Square:  " + "side= " + getSide() + " , Area= " + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color: BlackPink");
    }
}
