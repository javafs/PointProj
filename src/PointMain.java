public class PointMain {
    public static void main(String[] args)
    {
        // creates a Point object using the default constructor
        Point p1 = new Point();
        System.out.println("p1" + p1 + ": created using the default constructor:");

        // creates another Point object using the parametric constructor
        Point p2 = new Point(2, 3);
        System.out.println("p2" + p2 + ": created using the parametric constructor (x=2, y=3)");

        // sets p1's x-coordinate to 1
        p1.setX(1);
        System.out.println("p1" + p1 + ": x-coordinate is changed to 1 using command 'p1.setX(1)'");

        // sets p1's new location to x=3, y=5
        p1.setLocation(3, 5);
        System.out.println("p1" + p1 + ": p1's location is changed to (3, 5) using command 'p1.setLocation(3, 5)'");

        // sets p2's new location to x=-2, y=1
        Point.setLocationS(p2,-2, 1);
        System.out.println("p2" + p2 + ": p2's location is changed to (-2, 1) using command 'Point.setLocationS(p2,-2, 1);'");

        // shifts p2's location by dx=2, dy=1
        p2.translate(2,1);
        System.out.println("p2" + p2 + ": p2's location is shifted by dx=2, dy=1 using command 'p2.translate(2,1)'");

        // shifts p1's location by dx=0, dy=1
        Point.translateS(p1, 0,1);
        System.out.println("p1" + p1 + ": p1's location is shifted by dx=0, dy=1 using command 'Point.translateS(p1, 0,1)'");

        // Computes the distance between p1 and p2 using various methods:
        System.out.println("Computes the distance between p1 and p2 using various methods:");
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(Point.distanceBetweenTwoPoints(p1, p2));
        System.out.println(Point.distanceBetweenTwoPoints(p2, p1));
    }
}