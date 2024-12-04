class NegativeArgumentException extends Exception {
    public NegativeArgumentException(String message) {
        super(message);
    }
}

public class P11{
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("No command-line arguments provided.");
                return;
            }

            for (int i = 0; i < args.length; i++) {
                int value = Integer.parseInt(args[i]); 

                if (value < 0) {
                    throw new NegativeArgumentException("Negative argument detected: " + value);
                }
            }

            System.out.println("All command-line arguments are non-negative.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter only integer values.");
        } catch (NegativeArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

