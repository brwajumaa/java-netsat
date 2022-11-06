import java.util.Scanner;;

// Path: src/Netstat.java
// class to run windows netstat commands
class Netstat {
    // method to run netstat commands
    public void getNetstat() {
        try (
            // create a new scanner
                Scanner scanner = new Scanner(System.in)) {
            // create a new object of the class
            Command command = new Command();

            // netstat commands variables
            String netstat = "netstat";
            String netstatA = "netstat -a";
            String netstatAB = "netstat -ab";
            String netstatABE = "netstat -abe";
            String netstatABEN = "netstat -aben";

            System.out.println("\n Choose a netstat command to run:");
            System.out.println("1. netstat");
            System.out.println("2. netstat -a");
            System.out.println("3. netstat -ab");
            System.out.println("4. netstat -abe");
            System.out.println("5. netstat -aben");

            // get the user input
            int userInput = scanner.nextInt();

            // switch statement to run the netstat commands
            switch (userInput) {
                case 1:
                    // call the method
                    command.runCommand(netstat);
                    break;
                case 2:
                    // call the method
                    command.runCommand(netstatA);
                    break;
                case 3:
                    // call the method
                    command.runCommand(netstatAB);
                    break;
                case 4:
                    // call the method
                    command.runCommand(netstatABE);
                    break;
                case 5:
                    // call the method
                    command.runCommand(netstatABEN);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }
}