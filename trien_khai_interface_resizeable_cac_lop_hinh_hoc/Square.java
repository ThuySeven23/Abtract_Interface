package trien_khai_interface_resizeable_cac_lop_hinh_hoc;

public class Square extends Shape{
    private double edge = 1.0;


    public Square() {
    }

    public Square( double edge) {
        this.edge = edge;

    }

    public Square(String color, boolean filled,  double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }


    double getArea(){
        return this.edge*this.edge;
    }
    @Override
    public String toString() {
        return "Square with edge = "
                + getEdge()
                + " , which is a subclass of "
                + super.toString()
                +" , Area: "+this.getArea();
    }

    @Override
    public void resize(double percent) {
        double incresea = this.edge * percent;
        this.setEdge(incresea);
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.4);
        System.out.println(square);

        square = new Square("red" , true , 5.4);
        System.out.println(square);

    }

}
