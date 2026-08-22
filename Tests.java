public class Tests {
    public static void main(String[]args){
        double testScore1, testScore2, testScore3, average;
        // allows the test scroes to store decimal values 
        testScore1 = 88.2;
        testScore2 = 78.9;
        testScore3 = 97.6;
        //ai included this formula to calculate the average of 3 test scores
        average = (testScore1 + testScore2 + testScore3) / 3.0;
        //displays the test scores and the average of the 3 test scores.
        System.out.println("Test score 1: " + testScore1);
        System.out.println("Test score 2: " + testScore2);
        System.out.println("Test score 3: " + testScore3);
        System.out.printf("The average of 3 test scores is: %.2f%n", average);

    }
}
