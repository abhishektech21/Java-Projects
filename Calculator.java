import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("----------Simple Calculator Using java-----------");

        do{
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter an operator(*,+,-,/)");
        char operator = sc.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
               result =num1-num2;
               break;
            case '*':
             result =num1*num2;
             break;
             case '/':
             if(num1!=0){
                result=num1/num2;
             }
             else{
                System.out.println("cannot divide by zero");
                return;
             }
             break;

             default:
             System.out.println("Invalid operator!");
             return;

        }
        System.out.println("Result:"+result);

        System.out.println("Do you want to perfrom other opertaion(Y/n):");
        choice=sc.next();

    }while(choice.equalsIgnoreCase("Y"));

    System.out.println("Thank you");
    sc.close();

}}
