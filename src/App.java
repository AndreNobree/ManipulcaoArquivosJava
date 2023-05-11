import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        Recebe chamaRecebe = new Recebe();

        System.out.println("DIGITE 'doc' SE FOR DOC: ");
        System.out.println("DIGITE 'java' SE FOR JAVA: ");
        System.out.print("DIGITE 'time' SE FOR TIME: \n>> ");
        chamaRecebe.resp = entrada.next().toLowerCase();
        
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
                break;
        }
        


        entrada.close();
    }
}