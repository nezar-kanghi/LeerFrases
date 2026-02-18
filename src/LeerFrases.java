import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFrases {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("frases.txt"))) {

            String frase;

            while ((frase = reader.readLine()) != null) {
                System.out.println(frase);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
