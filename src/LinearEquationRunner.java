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
        System.out.println("The two points are: " + coordinate1 + " and " + coordinate2);

        int x1= Integer.parseInt(coordinate1.substring(0,2));
        int y1= Integer.parseInt(coordinate1.substring(3,5));
        int x2= Integer.parseInt(coordinate2.substring(0,2));
        int y2= Integer.parseInt(coordinate2.substring(3,5));

        LinearEquation random= new LinearEquation(x1,y1,x2,y2);
    }
}
