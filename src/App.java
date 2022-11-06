import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// run windows netsat commands inside java using oop concepts 
class App {
    public static void main(String[] args) {
        // create a new object of the class
        Netstat netstat = new Netstat();
        // call the method
        netstat.getNetstat();
    }
}

// Path: src/Netstat.java
// class to run windows netstat commands
class Netstat {
    // method to run netstat commands
    public void getNetstat() {
        // create a new object of the class
        Command command = new Command();
        // call the method
        command.runCommand("netstat -a");
    }
}

// Path: src/Command.java
// class to run windows commands
class Command {
    // method to run commands
    public void runCommand(String command) {
        try {
            // create a new process
            Process process = Runtime.getRuntime().exec(command);
            // create a new input stream
            InputStream inputStream = process.getInputStream();
            // create a new buffered reader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            // create a new string builder
            StringBuilder stringBuilder = new StringBuilder();
            // create a new string
            String line;
            // loop through the buffered reader
            while ((line = bufferedReader.readLine()) != null) {
                // append the line to the string builder
                stringBuilder.append(line);
                // append a new line to the string builder
                stringBuilder.append(System.getProperty("line.separator"));
            }
            // print the string builder
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            // print the stack trace
            e.printStackTrace();
        }
    }
}

