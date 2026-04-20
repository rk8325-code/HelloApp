public class HelloApp {
    public static void main(String[] args) {
        // Default greeting if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Build greeting using enhanced for loop
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}