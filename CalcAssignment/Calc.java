import java.util.Scanner;
public class Calc {
    //private fields 
    private double num1;
    private double num2;
// public constructor 
    public Calc (){
        
    }

// setter methods 
    public void setNum1(double newNum1){
        num1 = newNum1;
    }

    public void setNum2(double newNum2){
        num2 = newNum2;
    }

    // getter methods 
    public double getNum1(){
        return num1;
    }

    public double getNum2(){
        return num2;
    }
//custom methods 
//adds num1 and num2
    public double add(){
        return (num1 + num2);
    }
//subtract num1 and num2 
    public double subtract(){
        return (num1 - num2);
    }
//multiply num1 and num2
    public double multiply(){
        return (num1 * num2);
    }
//divide num1 and num2 
    public double divide(){
        return (num1 / num2);
    }
    // added method 
    public double getValidNumber(Scanner scan){
        while(!scan.hasNextDouble()){
            System.out.println("Invalid input. Please enter a number: ");
            scan.next();
        }
        return scan.nextDouble();
    }
    //tostring return every this as string 
    public String toString(){
        return  "Displaying private data fields using toString(): \n"
        + "Num1: " + num1 +"\n"
        + "Num2: "  + num2;
    }

}
