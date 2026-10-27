import java.util.ArrayList;
public class Asn5 {
    public static void main(String[] args){
        // create an ArrayList that stores Strings
        ArrayList<String> names = new ArrayList<String>();

        // create an ArrayList that stores Integers
      ArrayList<Integer> numbers= new ArrayList<Integer>();

        // add 4 String items to the first ArrayList
        names.add("purple");
        names.add("sunset orange");
        names.add("pinkish burgandy");
        names.add("baby blue");

        // add 4 Integer items to the second ArrayList
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);

        // display the String ArrayList using an enhanced for loop
        System.out.println("Original colors: ");
        for (String name: names){
            System.out.println(name);

        }



        // display the Integer ArrayList using an enhanced for loop
        System.out.println("Original numbers: ");
        for(int number:numbers){
            System.out.println(number);
        }



        // use one ArrayList method that changes the String list
        // Example choices: remove(), set(), clear(), add()
        names.set(1, "forest green");


        // use one ArrayList method that changes the Integer list
        // Example choices: remove(), set(), clear(), add()
        numbers.remove(Integer.valueOf(5));


        // display the String ArrayList again after the change
        System.out.println("Colors after change: ");
        for (String name : names){
            System.out.println(name);

        }



        // display the Integer ArrayList again after the change
        System.out.println("Numbers after change: ");
        for (int number:numbers){
            System.out.println(number);
        }
    }
}
