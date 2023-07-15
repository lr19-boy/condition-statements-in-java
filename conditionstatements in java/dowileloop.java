import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class demoversions {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the fruits: ");
        String inp1 = inp.nextLine();
        String inp2 = inp.nextLine();
        String inp3 = inp.nextLine();
        String inp4 = inp.nextLine();


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add(inp1);
        fruits.add(inp2);
        fruits.add(inp3);
        fruits.add(inp4);

        Enumeration<String> fruit = Collections.enumeration(fruits);

        System.out.println("Listing of elements: ");

        do 
        {
            System.out.println(fruit.nextElement());
        }
        while(fruit.hasMoreElements());

        inp.close();
    }
}