import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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