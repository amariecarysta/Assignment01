public class Main2 {
    public static void main(String[] args) {
        if(args.length > 0) {
            if (realNum(args[0])) {

                int inputAmount = Integer.parseInt(args[0]);


            for (int i = 0; i < inputAmount; i++ ) {
                System.out.println("Woah");
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
