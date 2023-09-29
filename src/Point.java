public class Point {
   private int x, y;

   // default constructor
   public Point(){
      this.x = 0;
      this.y = 0;
   }

   // parametric constructor
   public Point(int y){
      this.y = y;
   }

   // parametric constructor
   public Point(int x, int y){
      this.x = x;
      this.y = y;
   }

   public int getX(){
      return x;
   }
   public int getY(){
      return y;
   }

   public void setX(int x){
      this.x = x;
   }

   public void setY(int y){
      this.y = y;
   }

   public void setLocation(int newX, int newY){
      x = newX;
      y = newY;
   }

   public void translate(int dx, int dy){
      x += dx;
      y += dy;
   }

   public double distance (Point other){
      double dx = this.x - other.x;
      double dy = this.y - other.y;
      return Math.sqrt(dx*dx + dy*dy);
   }
   public String toString(){
      return "(" + this.x + ", " + this.y +")";
   }
}

