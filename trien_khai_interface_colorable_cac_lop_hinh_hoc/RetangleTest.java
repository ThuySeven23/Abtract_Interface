package trien_khai_interface_colorable_cac_lop_hinh_hoc;

public class RetangleTest {
    public static void main(String[] args) {
        Retangle Retangle = new Retangle();
        System.out.println(Retangle);

        Retangle = new Retangle(2.3, 5.8);
        System.out.println(Retangle);

        Retangle = new Retangle(2.5, 3.8, "orange", true);
        System.out.println(Retangle);
    }
}
