import java.util.*;
public class SimpleCalculaotr {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        System.out.println("Select operation: +, -, *, /");
        char op = sc.next().charAt(0);
        double result;
        switch(op){
            case '+':
            result = num1 + num2;
            System.out.println("Result: " + result);
            break;
            case '-':
            
            result = num1 - num2;
            System.out.println("Result: " + result);  
            break;
            case '*': 
            System.out.println("Result: " + (num1 * num2));
            break;
            case '/':
            if(num2 != 0){
                result = num1 / num2;
                System.out.println("Result: " + result);
            }else
            {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
            
            default:
            System.out.println("Invalid operator selected.");

        }
        sc.close();



    }
    
}
