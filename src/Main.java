public class Main {
    public static void main(String[] args)
    {
        Point p1 = new Point();
        Point p2 = new Point(9, 13);
        Point p3 = new Point(300);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.setLocation(5, 7);
        System.out.println(p1);
        p1.translate(1, 2);
        System.out.println(p1);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));

    }
}