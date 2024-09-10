package factoryPattern;

import java.util.Scanner;

public class selectAnimal 
{
   public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("Select an option: ");
                System.out.println("1. Cat");
                System.out.println("2. Dog");
                System.out.println("3. Exit");

                choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:  System.out.println("A cat has 9 lives."); 
                    break;
                case 2:  System.out.println("Kindly enter the dog breed: ");
                    String breed = scanner.next();
                    System.out.println("You selected a " + breed + " .");
                    break;
                case 3:  System.out.println("Exiting..."); 
                    break;
                default: 
                    System.out.println("Invalid choice. Please select again.");
            }
        }
            while (choice != 3);
        
            scanner.close();
    }
}
