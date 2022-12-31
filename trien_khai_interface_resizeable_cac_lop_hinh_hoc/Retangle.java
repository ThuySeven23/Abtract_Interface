package trien_khai_interface_resizeable_cac_lop_hinh_hoc;

public class Retangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Retangle() {
    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Retangle with width = "
                + getWidth()
                + " and length = "
                + getLength()
                + ", which is a subclass of "
                + super.toString()
                +" , Area: "+this.getArea()
                +" , Perimeter: " + this.getPerimeter();
    }

    @Override
    public void resize(double percent) {
        double increase = this.length * percent;
        double increase1 = this.width * percent;
        this.setLength(increase);
        this.setWidth(increase1);
    }

    public static void main(String[] args) {
        Retangle Retangle = new Retangle();
        System.out.println(Retangle);

        Retangle = new Retangle(2.3, 5.8);
        System.out.println(Retangle);

        Retangle = new Retangle(2.5, 3.8, "blue", true);
        System.out.println(Retangle);
    }

}
