public class LinearEquation {
   private int x1;
   private int y1;
   private int x2;
   private int y2;

   public LinearEquation (int x1, int y1, int x2, int y2) {
       this.x1=x1;
       this.y1=y1;
       this.x2=x2;
       this.y2=y2;
   }

   public String slope () {
       int yNum= y2-y1;
       int xNum= x2-x1;
       double slope= (yNum)/(xNum);
       if (yNum % xNum== 0) {
           return (int) (slope) + "x";
       } else {
           return yNum + "/ " + xNum + "x";
       }

   }




}
