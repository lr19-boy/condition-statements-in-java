import java.util.Scanner;  

class demo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    
    System.out.println("Enter your name: ");
    String name = input.next();
    System.out.println("Enter the number: ");
    Integer demo = input1.nextInt(); 
    
    /* <----if statement----> */
    if(name.equals(name)) {
      System.out.println(name);
    }
    else {
      System.out.println("Error");
    }

    if(demo.equals(demo)) {
      System.out.println(demo);
    }
    else {
      System.out.println("Error");
    }
    
    input.close();
    input1.close();
    
  }
}

