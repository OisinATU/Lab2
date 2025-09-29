package ie.atu;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        //Setup scanner
        Scanner scan1 = new Scanner(System.in);

        //get operation
        System.out.print("Please enter an operation: ");
        String operation = scan1.nextLine();
        System.out.println(operation);

        Calculator myCalc = new Calculator();

        int return_value = myCalc.add_numbers(2,4);
        System.out.println(return_value);


        //get first value

        //get second value


    }
}
