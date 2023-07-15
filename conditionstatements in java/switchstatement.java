import java.util.Scanner;

class switcher
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 fruits: ");
        String fruits = input.next();

        /* <----switch statement----> */
        switch (fruits) {
            case "apple":
                System.out.println("You entered apple");
                break;
            
            case "mango":
                System.out.println("You entered mango");
                break;
                
            case "banana":
                System.out.println("You entered banana");
                break;
                
            case "blueberry":
                System.out.println("You entered blueberry");
                break;
                
            case "strawberry":
                System.out.println("You entered strawberry");
                break;
        
            default:
            System.out.println("None are in the list");
            break;
        }

        input.close();
    } 
}