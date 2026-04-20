/**
 * HelloApp – UC4 – A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!"
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Developer Name
 * @version 4.0
 */

public class HelloApp {
    public static void main(String[] args) {
        // Default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Build a greeting string from multiple names
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}
