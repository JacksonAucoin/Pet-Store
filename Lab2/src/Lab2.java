import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Jackson Aucoin CSC 1351

public class Lab2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        ArrayList<Pet> pet = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {

            String name = s.nextLine();
            String type = s.nextLine();
            double price = s.nextDouble();
            s.nextLine();
            pet.add(new Pet(name, type, price));
        }
        System.out.println();
        System.out.println("Pet name        Type     Price");
        Collections.sort(pet);
        for (Pet c : pet)
            c.printInfo();


    }

}