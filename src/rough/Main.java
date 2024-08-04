package rough;

public class Main {
    public static void main(String [] args) {
        var p1 = new Point(5.2f, 3.1f);
        var p2 = new Point(0, 4);
        var p3 = Integer.parseInt("5");
        var p4 = new Point(5.2f, 3.1f);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
    }

}
