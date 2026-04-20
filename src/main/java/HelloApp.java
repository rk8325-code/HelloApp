public class HelloApp {
    public static void main(String[] args) {
        // Default greeting
        String names = "World";

        // If arguments are provided, join them with commas
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}