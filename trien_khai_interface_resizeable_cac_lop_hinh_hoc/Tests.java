package trien_khai_interface_resizeable_cac_lop_hinh_hoc;

public class Tests {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Retangle(7,14);
        shapes[2] = new Square(10);

        System.out.println("Before change:");

        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
        System.out.println(shapes[2]);
        System.out.println();

        System.out.println("After change:");

        shapes[0].resize(4);
        shapes[1].resize(5);
        shapes[2].resize(6);

        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
        System.out.println(shapes[2]);
    }
}
