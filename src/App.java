import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        Recebe chamaRecebe = new Recebe();

        System.out.println("DIGITE 'doc' SE FOR DOC: ");
        System.out.println("DIGITE 'java' SE FOR JAVA: ");
        System.out.print("DIGITE 'time' SE FOR TIME: \n>> ");
        chamaRecebe.resp = entrada.next().toLowerCase();
        //chamaRecebe.resp está na classe Recebe, pq eu n declarei o resp aqui? sei lá kkkkk
        try {
            switch (chamaRecebe.resp){
                case "doc":
                    chamaRecebe.menuDoc();
                    break;
    
                case "java":
                    chamaRecebe.menuJava();
                    break;
    
                case "time":
                    chamaRecebe.menuTime();
                    break;
    
                default:
                    System.out.println("COMANDO INVÁLIDO");
                    return;//se caso errar, vai repetir o case
            }
            chamaRecebe.carrega();
            chamaRecebe.pegaArquivo();
            
            LerArquivoTxt chamaLerArquivoTxt = new LerArquivoTxt();
            chamaLerArquivoTxt.abreArquivo();

        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao executar o programa: " + e.getMessage());
            e.printStackTrace();

        } finally {
            entrada.close();
        }

    }
}
