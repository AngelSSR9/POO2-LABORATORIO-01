public class CirculoTest {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        System.out.println("Radio del circulo por defecto: " + c1.getRadio());
        System.out.println("Area del circulo por defecto: " + c1.getArea());

        Circulo c2 = new Circulo(6);
        System.out.println("Radio del circulo modificado: " + c2.getRadio());
        System.out.println("Area del circulo modificado: " + c2.getArea());

        System.out.println(c2.toString());
    }
}
