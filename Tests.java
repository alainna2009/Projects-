public class Tests {
    public static void main(String[]args){
        double testScore1, testScore2, testScore3, average;
        testScore1 = 88.2;
        testScore2 = 78.9;
        testScore3 = 97.6;
        //ai included this formula to calculate the average of 3 test scores
        average = (testScore1 + testScore2 + testScore3) / 3.0;
        System.out.println("Test score 1: " + testScore1);
        System.out.println("Test score 2: " + testScore2);
        System.out.println("Test score 3: " + testScore3);
        System.out.printf("The average of 3 test scores is: %.2f%n", average);

    }

}
