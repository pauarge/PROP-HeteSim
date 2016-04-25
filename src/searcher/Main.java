package searcher;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String readLine;
        String outputLine;
        System.out.println("Benvigut al projecte de prop del grup 18-?. Escriu 'help' per l'ajuda, o 'quit' per sortir.");
        try {
            System.out.print(">");
            while ((readLine = bufferedReader.readLine()) != null) {
                readLine = readLine.toLowerCase();
                outputLine = controller.executeLine(readLine);
                if (outputLine != null) {
                    System.out.println(outputLine);
                }
                System.out.print(">");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
