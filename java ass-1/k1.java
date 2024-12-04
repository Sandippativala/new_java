import java.util.Arrays;

class k1 {
    public static void main(String args[]) {
        
        try {

            int arr[] = new int[args.length];
            
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.println();

            Arrays.sort(arr);

            //System.out.println("After Sorting ::");
            for (int i = 0; i< arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("Minimum Value : " + arr[0] + " Maximum Value : " + arr[arr.length - 1]);

        } 
         catch (NumberFormatException e){
            System.out.println("Invalid input. Please provide only integer values.");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No arguments provided. Please provide integer arguments.");
        }

    }
}
