import java.util.Scanner;


public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Bad = "";
        Double Height = 0.0;
        Double Width = 0.0;
        Double Area = 0.0;
        Double Perimeter = 0.0;
        Double Diagonal = 0.0;
        Boolean Valid = false;
        do{
            System.out.println("Enter the Height of the rectangle");
            if (input.hasNextDouble()){
                Height = input.nextDouble();
                input.nextLine();
                Valid = true;
            }
            else{
                Bad = input.nextLine();
                System.out.println("You have entered " + Bad);
                System.out.println("Please enter a valid height");
            }
        }while(!Valid);
        Valid = false;
        do{
            System.out.println("Enter the Width of the rectangle");
            if (input.hasNextDouble()){
                Width = input.nextDouble();
                input.nextLine();
                Valid = true;
            }
            else{
                Bad = input.nextLine();
                System.out.println("You have entered " + Bad);
                System.out.println("Please enter a valid width");
            }
        }while(!Valid);

        if (Valid){
            Area = Height * Width;
            Perimeter = (Height * 2) + (Width * 2);
            Diagonal = Math.sqrt((Height * Height) + (Width * Width));
            System.out.println("The area of the rectangle is " + Area);
            System.out.println("The perimeter of the rectangle is " + Perimeter);
            System.out.println("The diagonal of the rectangle is " + Diagonal);

        }

    }
}
