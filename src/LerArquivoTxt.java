import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTxt {
    
    void abreArquivo() {
        try {
            Recebe chamaRecebe = new Recebe();
            String caminhoArquivo =  chamaRecebe.pegaArquivo();
            
            System.out.println(caminhoArquivo);
            FileReader reader = new FileReader(caminhoArquivo);
            
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
