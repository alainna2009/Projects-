import java.util.Scanner;

public class Tests {
    //Private data fields
    private double ave;
    private int count;
    private int score;
    //public constructors 
    public Tests(){
        ave = 0.0;
        count = 0; 
        score = 0; 

    }
    
//public set ot mutator methods for every private data field
    public void setScore(int newScore){
        score = (newScore + score);
        count = count +1;
    }
// public get or accessor methods for every private data field
    public int getScore(){
        return score; 

    }
    public int getCount(){
        return count;
    }
    public double getAve(){
        return ave;
    }

    public void getAverage(){
        Scanner input = new Scanner(System.in) ;
        
        double sum = 0.0;
        count = 0; 
        System.out.println("Enter a test score (-1 to quit): " );
        score = input.nextInt();

        while (score != -1){
            sum = sum + score;
            count ++; 

            System.out.print("Enter a test score (-1 to quit ): ");
            score = input.nextInt();

        }   
        ave = sum/count; 

         input.close();

    }
// public toString method that returns a string description of the object state 
    public String toString(){
        return "The average of the "
 + count + " scores entered is "+ String.format("%.2f", ave) + ".";
    }
}

