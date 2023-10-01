/*
   A Point object stores the (x, y) coordinates of a position in two dimensional space.
   See textbook pages 539 - 567 for various versions
 */
public class Point {
   private int x;
   private int y;

   // default constructor
   public Point(){
      this.x = 0;
      this.y = 0;
   }

   /*
    this is the default constructor from textbook page 564, which is equivalent to above
   public Point() {
      this(0, 0); // calls Point(int, int) constructor
   }
   */

   // parametric constructor with one parameter only
   // this is not a useful constructor but only for demo purpose here
   // note that the initial value of x is 0
   public Point(int y){
      this.y = y;
   }

   // parametric constructor (with two parameters)
   public Point(int x, int y){
      this.x = x;
      this.y = y;
   }

   // returns the x-coordinate of this point
   public int getX(){
      return x;
   }

   // returns the y-coordinate of this point
   public int getY(){
      return y;
   }

   public void setX(int x){
      this.x = x;
   }

   public void setY(int y){
      this.y = y;
   }

   // sets this point's (x, y) location to the given values
   public void setLocation(int x, int y){
      this.x = x; // note that 'this' must be used differentiate the two x's
      this.y = y; // note that 'this' must be used differentiate the two y's
   }

   // sets a point's (x, y) location to the given values
   public static void setLocationS(Point p, int x, int y){
      p.x = x;
      p.y = y;
   }

   // shifts this point's location by the given amount
   public void translate(int dx, int dy){
      this.x += dx;
      this.y += dy;
   }

   // shifts a point's location by the given amount
   public static void translateS(Point p, int dx, int dy){
      p.x += dx;
      p.y += dy;
   }

   // returns the distance between this Point and (0, 0)
   public double distanceFromOrigin() {
      return Math.sqrt(x * x + y * y);
   }

   // returns the distance between this Point and other Point
   public double distance (Point other){
      double dx = this.x - other.x;
      double dy = this.y - other.y;
      return Math.sqrt(dx*dx + dy*dy);
   }

   // this static methods returns the distance between two given Points
   public static double distanceBetweenTwoPoints(Point p1, Point p2){
      double dx = p1.x - p2.x;
      double dy = p1.y - p2.y;
      return Math.sqrt(dx*dx + dy*dy);
   }

   // returns a String representation of this point
   public String toString(){
      return "(" + this.x + ", " + this.y +")";
   }
}