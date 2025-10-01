package ie.atu;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        //Setup scanner
        Scanner scan1 = new Scanner(System.in);

        int valid = 0;

        while(valid==0) {

            // input for first number
            System.out.print("Enter first number: ");
            double firstNum = scan1.nextDouble();
            System.out.println("You entered " + firstNum);

            //input for second number
            System.out.print("Please enter a second number: ");
            double secondNum = scan1.nextDouble();
            System.out.println("You entered " + secondNum);

            // clear the newline left by nextDouble()
            scan1.nextLine();

            //get operation
            System.out.print("Please enter an operation (add/subtract/multiply/divide): ");
            String operation = scan1.nextLine();
            System.out.println(operation);

            // Create instance of calculator
            Calculator myCalc = new Calculator();

            double return_value=0;

            switch(operation) {
                case "add":
                    return_value = myCalc.add_numbers(firstNum, secondNum);
                    System.out.println("Answer: " + return_value);
                    break;
                case "subtract":
                    return_value = myCalc.subtract_numbers(firstNum, secondNum);
                    System.out.println("Answer: " + return_value);
                    break;
                case "multiply":
                    return_value = myCalc.multiply_numbers(firstNum, secondNum);
                    System.out.println("Answer: " + return_value);
                    break;
                case "divide":
                    return_value = myCalc.divide_numbers(firstNum, secondNum);
                    System.out.println("Answer: " + return_value);
                    break;
                default:
                    System.out.println("Error: Invalid operation \"" + operation + "\"");
            }


        }

        //get first value

        //get second value



    }
}
