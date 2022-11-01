import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coordinate1= input.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coordinate2= input.nextLine();
        System.out.println();
        System.out.println();
        // welcoming the user to the program, interaction, inputting points

        int x1= Integer.parseInt(coordinate1.substring(1,coordinate1.indexOf(",")));
        int y1= Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",") + 2, coordinate1.indexOf(")")));
        int x2= Integer.parseInt(coordinate2.substring(1,coordinate2.indexOf(",")));
        int y2= Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",") + 2,coordinate2.indexOf(")")));
        LinearEquation obj= new LinearEquation(x1,y1,x2,y2);
        //make the coordinates integers/numbers so they can be used for calculating certain things
        if (x1!=x2) {
            System.out.println("----- Line info -----");
            System.out.print(obj.lineInfo());
        } else {
            System.out.println("These points are on a vertical line: x = " + x1);
        }
        //if the x coordinates are the same or not, if they are they would report the statement underneath the else portion, if not it is on the if portion

        System.out.print("Enter a value for x: ");
        double newX= input.nextDouble();
        System.out.println();
        System.out.println(obj.coordinateForX(newX));
        //inputting another x-coordinate to get the y-coordinate




    }
}
