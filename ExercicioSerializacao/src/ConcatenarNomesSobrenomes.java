import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcatenarNomesSobrenomes {

    public static void main(String[] args) throws IOException {
        String nomesFilePath = "C:/Users/12116031/ArquivoNomes.txt";
        String sobrenomesFilePath = "C:/Users/12116031/SobreNomes.txt";

        // Realizando a leitura do primeiro arquivo
        BufferedReader nomesReader = new BufferedReader(new FileReader(nomesFilePath));
        String line;
        System.out.println("Nomes:");
        while ((line = nomesReader.readLine()) != null) {
            System.out.println(line);
        }
        nomesReader.close();

        // Realizando a leitura do segunda arquivo
        BufferedReader sobrenomesReader = new BufferedReader(new FileReader(sobrenomesFilePath));
        System.out.println("\nSobrenomes:");
        while ((line = sobrenomesReader.readLine()) != null) {
            System.out.println(line);
        }
        sobrenomesReader.close();

        // Concatenando os dois arquivos
        BufferedReader nomesFileReader = new BufferedReader(new FileReader(nomesFilePath));
        BufferedReader sobrenomesFileReader = new BufferedReader(new FileReader(sobrenomesFilePath));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/12116031/NomeSobrenome.txt"));
        System.out.println("\nNomes e Sobrenomes concatenados:");
        while ((line = nomesFileReader.readLine()) != null) {
            String nome = line.trim();
            String sobrenome = sobrenomesFileReader.readLine().trim();
            String nomeSobrenome = nome + " " + sobrenome;
            writer.write(nomeSobrenome + "\n");
            System.out.println(nomeSobrenome);
        }
        nomesFileReader.close();
        sobrenomesFileReader.close();
        writer.close();

        System.out.println("\nResultado escrito no arquivo NomeSobrenome.txt.");
    }
}
