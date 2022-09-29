import java.text.DecimalFormat;
import java.util.Scanner;

public class metric {
    public static void main(String[] args) {
        String Trash = "";
        double userMet = 0;
        double outMiles = 0;
        double outFeet = 0;
        double outInch = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a distance in Meters ");
        if (in.hasNextDouble()){
            userMet = in.nextDouble();
            in.nextLine();
        }
        else{
            Trash.equals(in.nextLine());
            System.out.println("Invalid entry. Please try again.");
            System.exit(0);
        }
        outMiles = userMet / 1609;
        outFeet = userMet * 3.281;
        outInch = userMet * 39.37;
        System.out.println("This distance in miles is " + df.format(outMiles) + ".");
        System.out.println("This distance in feet is " + df.format(outFeet) + ".");
        System.out.println("This distance in inches is " + df.format(outInch) + ".");

    }
}
