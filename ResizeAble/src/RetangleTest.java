public class RetangleTest {
    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        System.out.println(retangle);
        retangle = new Retangle(3, 2);
        System.out.println(retangle);
        retangle = new Retangle("Red", false, 4.0, 5.5);
        System.out.println(retangle);
    }
}
