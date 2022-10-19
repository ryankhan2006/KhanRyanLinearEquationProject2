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

        int x1= Integer.parseInt(coordinate1.substring(1,coordinate1.indexOf(",")));
        int y1= Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",") + 1, coordinate1.indexOf(")")));
        int x2= Integer.parseInt(coordinate2.substring(1,coordinate2.indexOf(",")));
        int y2= Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",") + 1,coordinate2.indexOf(")")));
        LinearEquation random= new LinearEquation(x1,y1,x2,y2);
        String equation= random.equation();
        System.out.println(equation);



    }
}
