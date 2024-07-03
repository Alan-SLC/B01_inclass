import java.util.HashSet;
import java.util.Scanner;

public class AnimalHandbook {
    public static void main(String[] args) {
        HashSet<String> animals = new HashSet<String>();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Animal Name? ");
        String newAnimal = keyboard.nextLine();
        animals.add(newAnimal);
        while (!newAnimal.isEmpty()){
            System.out.print("Animal Name? ");
            newAnimal = keyboard.nextLine();
            if(!newAnimal.isEmpty()) {
                animals.add(newAnimal);
            }
        }
        System.out.println("All registered animal names: " + animals);
        System.out.println("Done");
    }
}
