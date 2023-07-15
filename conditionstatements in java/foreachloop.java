import java.util.ArrayList;
import java.util.Scanner;

class forloop {    
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the bike: ");
        String inp1 = inp.nextLine();
        String inp2 = inp.nextLine();
        String inp3 = inp.nextLine();
        String inp4 = inp.nextLine();


        ArrayList<String> bike = new ArrayList<>();
        bike.add(inp1);
        bike.add(inp2);
        bike.add(inp3);
        bike.add(inp4);

        for (String i : bike)
        {
            System.out.println("List of bike: "+i);
        }

        inp.close();
    }
}
