import java.util.Scanner;

public class checkpointProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Hunger = 10;
        int Energy = 10;
        int Social = 10;
        String name;
        System.out.println("What shall your pet's name be?");
        name = sc.nextLine();
        System.out.println("Your pet's name is " + name);

        while (Energy > 1) {
            System.out.println("What would you like to do with your pet?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");

            String action = sc.nextLine();

            if (action.equals("1")) {
                Hunger -= 5;
                Energy += 5;
                Social -= 5;
            } else if (action.equals("2")) {
                Hunger += 5;
                Energy -= 5;
                Social += 5;
            } else if (action.equals("3")) {
                Hunger = 5;
                Energy += 5;
                Social -= 5;
            } else {
                System.out.println("Invalid action. Please choose 1, 2, or 3.");
                continue;
            }

            System.out.println("Hunger: " + Hunger);
            System.out.println("Energy: " + Energy);
            System.out.println("Social: " + Social);
        }

        System.out.println("Your pet has died");
    }
}