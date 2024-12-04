import java.util.Arrays;

class k2{
    public static void main(String[] args) {
        
        
            if(args.length == 0){
                System.out.println("No arguments provided. Please provide integer arguments.");
                return;
            }

            String[] arr = new String[args.length];

            System.out.println("Before Sorting ::");
            for (int i = 0; i < args.length; i++) {
                arr[i] = args[i];
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            Arrays.sort(arr); 

            System.out.println("After Sorting ::");
            for (int i = 0; i< arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

    }
}
