import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double Cel = 0.0;
        String Bad = "";
        Double F = 0.0;
        Boolean Valid = false;
        System.out.println("Please enter the temperature in Celsius  ");
        do {
            if (in.hasNextDouble()) {
                Cel = in.nextDouble();
                in.nextLine();
                Valid = true;
            }
            else {
                Bad = in.nextLine();
                System.out.println("Please enter a valid temperature in Celsius");
                System.out.println("You have entered " + Bad);
            }
        }while(!Valid);
        if(Cel == 100.0){
            System.out.println("You have entered 100 Celsius, Which is equal to 212 degrees Fahrenheit");
        }
        else if(Cel == 0.0){
            System.out.println("You have entered 0.0 Celsius, Which is equal to 32 degrees Fahrenheit");
        }
        else{
            F = (Cel * 9 / 5) + 32;
            System.out.println(Cel + " degrees celsius is equal to " + F + "degrees Fahrenheit");
        }

    }
}

