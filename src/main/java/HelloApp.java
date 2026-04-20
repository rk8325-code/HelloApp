public class HelloApp {
    public static void main(String[] args) {
        // Default greeting if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Build greeting string with trailing delimiter
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove the last ", " using substring
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}