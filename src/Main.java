import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int num1 = 0;
        int num2 = 0;

        System.out.print("Enter the first number: ");
        if(scan.hasNextInt()){
            num1 = scan.nextInt();
        }else{
            System.out.print("Your input was invalid.");
            System.exit(0);
        }
        System.out.print("Enter the second number: ");
        if(scan.hasNextInt()){
            num2 = scan.nextInt();
        }else{
            System.out.print("Your input was invalid.");
            System.exit(0);
        }
        if(num1 == num2){
            System.out.print(num1 + " is equal to " + num2 + ".");
        }else if(num1 > num2){
            System.out.print(num1 + " is greater than " + num2 + ".");
        }else if(num1 < num2){
            System.out.print(num1 + " is less than " + num2 + ".");
        }
    }
}