import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double TankCap = 0.0;
        Double MPG = 0.0;
        Double GasPrices = 0.0;
        String Bad = "";
        Boolean Valid = false;
        Double MaxTravel;
        Double Miles100;
        do{
            System.out.println("Enter Tank Capacity: ");
            if (input.hasNextDouble()) {
                TankCap = input.nextDouble();
                input.nextLine();
                Valid = true;

            }
            else {
                Bad = input.nextLine();
                System.out.println("You have entered " + Bad);
                System.out.println("Please enter a valid tank capacity");
            }
        }while (!Valid);
        Valid = false;
        do{
            System.out.println("Enter MPG: ");
            if (input.hasNextDouble()) {
                MPG = input.nextDouble();
                input.nextLine();
                Valid = true;
            }
            else {
                Bad = input.nextLine();
                System.out.println("You have entered " + Bad);
                System.out.println("Please enter a valid MPG");
            }
        }while (!Valid);
        Valid = false;
        do{
            System.out.println("Enter Gas Price: ");
            if (input.hasNextDouble()) {
                GasPrices = input.nextDouble();
                input.nextLine();
                Valid = true;

            }
            else{
                Bad = input.nextLine();
                System.out.println("You have entered " + Bad);
                System.out.println("Please enter a valid Gas price");
            }
        }while (!Valid);

        if (Valid == true) {
            MaxTravel = TankCap * MPG;
            Miles100 = ((100/MPG) * GasPrices);
            System.out.println("To travel 100 miles it would cost " + Miles100 + "$");
            System.out.println("On a full tank you could travel " + MaxTravel + " Miles");
        }
    }
}
