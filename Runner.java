import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());
        Pet pet2 = new Pet("Buster", 11, "Dog"); 
        System.out.println(pet2.toString());
    
        System.out.println("Enter animal type: "); 
        String type =scan.nextLine();
        System.out.println("Enter animal name: ");
        String name = scan.nextLine();
        System.out.println("Enter animal age: ");
        int age =scan.nextInt();

         Pet pet3 = new Pet(name, age, type);
         System.out.println(pet3.toString());

         scan.close();
    }
 }
