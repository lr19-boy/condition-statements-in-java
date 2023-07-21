import java.util.ArrayList;
import java.util.Scanner;

class inputandoutput {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          Scanner input1 = new Scanner(System.in);
          Scanner input2 = new Scanner(System.in);

          System.out.println("Enter your name: ");
          String name = input.next();

          System.out.println("Enter your name: ");
          String name1 = input.next();

          System.out.println("Enter the number: ");
          Integer demo = input1.nextInt();

          System.out.println("Enter the value: ");
          Integer demo1 = input2.nextInt();

          Integer no = 30;

          Boolean boolean1 = true | false;

          while (boolean1) {
               ArrayList<String> demos = new ArrayList<>();
               demos.add(name);
               demos.add(name1);
                    for (Integer i = 0; i < no; ++i) {
                         if (name.equals(name1)) {
                              System.out.println("Your name is " + name);
                         }
                         else if (demo <= demo1) {
                              System.out.println("The value you entered is: " + (demo + demo1));
                         }

                         else {
                              System.out.println("Error!!!");
                         }
                    }
               break;
          }
          
          input.close();
          input1.close();
          input2.close();
     }
}
