import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {


        if(args.length > 0) {
            if (realNum(args[0])) {

                int inputAmount = Integer.parseInt(args[0]);


                Scanner scanner = new Scanner(System.in);

                System.out.println("What is your favorite fruit? ");
                String fruitInput = scanner.nextLine();

                for (int i = 0; i < inputAmount; i++) {
                    System.out.println("You like " + fruitInput + "!");
            }
        } else {
            System.out.println("uh-oh");
         }
        }
    }

    public static boolean realNum(String str) {

            for (char c : str.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
    
    
}
