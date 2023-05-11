import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTxt {
    
    void abreArquivo() {
        try {
            Recebe chamaVariavelArquivo = new Recebe();
            //colocar o caminho numa variavel da classe Recebe.java e chame ela aqui
            FileReader reader = new FileReader(chamaVariavelArquivo.nomeArquivo);
            
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}