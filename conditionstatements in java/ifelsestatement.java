import java.util.Scanner;  

class demo {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);

    System.out.println("Enter the number: ");
    Integer demo = input1.nextInt();
    Integer number = 60;  
    
    /* <----else if statement----> */
    if(demo == 40) {
      System.out.println("It is equal");
    }

    else if (demo <= number) {
      System.out.println("It is not equal");
    }

    else 
    {
        System.out.println("Error!!!");
    }
    
    input1.close();
    
  }
}

