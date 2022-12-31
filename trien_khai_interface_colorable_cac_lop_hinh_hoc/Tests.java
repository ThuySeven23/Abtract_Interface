package trien_khai_interface_colorable_cac_lop_hinh_hoc;

public class Tests {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(5, "Yellow", true);
        shapes[1] = new Retangle(6, 7, "Blue", false);
        shapes[2] = new Square("Red", true, 9);

        for (Shape s : shapes){
            System.out.println(s);
            if (s instanceof Colorable){
                s.howToColor();
            }
        }

    }
}
