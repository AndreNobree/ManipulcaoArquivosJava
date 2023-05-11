import java.util.Scanner;

public class Recebe { 
    String resp;
    int respNumber;
    String nomeArquivo;

    void carrega(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE O NUMERO DA OPÇÃO >> ");
        respNumber = entrada.nextInt();

        

        entrada.close();

        pegaArquivo();

        return;
    }

    String pegaArquivo() {
        LerArquivoTxt chamaLerArquivoTxt = new LerArquivoTxt();
        nomeArquivo = "";
        switch (respNumber){
            case 1:
                nomeArquivo += "0DOCsankhya.txt";
                

                break;
            case 2:
                nomeArquivo += "0DOCtabelas.txt";
                
                break;
            case 3:
                nomeArquivo += "DOCdinamicVO.txt";
                
                
                break;
            case 4:
                nomeArquivo += "DOCgetEmptyAsNull.txt";
                
                break;
            case 5:
                nomeArquivo += "DOCgetNullAsEmpty.txt";
                
                break;
            case 6:
            
                nomeArquivo += "DOCisEmpty.txt";
                
                break;
            case 7:
            
                nomeArquivo += "DOCisNotEmpty.txt";
                
                break;
            case 8:
            
                nomeArquivo += "DOCreplaceString.txt";
                
                break;
            case 9:
            
                nomeArquivo += "JAVAconexao.txt";
                
                break;
            case 10:
            
                nomeArquivo += "JAVAjapeWrapper.txt";
                
                break;
            case 11:
            
                nomeArquivo += "JAVAselect.txt";
                
                break;
            case 12:
            
                nomeArquivo += "JAVAselect2.txt";
                
                break;
            case 13:
            
                nomeArquivo += "JAVAtimeout.txt";
                
                break;   
            case 14:
            
                nomeArquivo += "TIMEadd.txt";
                
                break; 
            case 15:
            
                nomeArquivo += "TIMEclearTime.txt";
                
                break; 
            case 16:
            
                nomeArquivo += "TIMEgetNow.txt";
                
                break; 
            case 17:
            
                nomeArquivo += "TIMEgetToday.txt";
                
                break;          
        }
        chamaLerArquivoTxt.abreArquivo();
        return nomeArquivo;
    }

    void menuDoc(){
        System.out.println("#################################");
        System.out.println("1 -> MÓDULO JAVA - SANKHYA");
        System.out.println("2 -> TABELAS MAIS USADAS - SANKHYA");
        System.out.println("3 -> DinamicVO - JAVA");
        System.out.println("4 -> getEmptyAsNull - JAVA");
        System.out.println("5 -> getNullAsEmpty - JAVA");
        System.out.println("6 -> isEmpty - JAVA");
        System.out.println("7 -> isNotEmpty - JAVA");
        System.out.println("8 -> replaceString - JAVA");
        System.out.println("#################################");
        carrega();
    }
    void menuJava(){
        System.out.println("#################################");
        System.out.println("9 -> CONEXÃO BD JAVA - JAVA/SANKHYA");
        System.out.println("10 -> japeWrapper - SANKHYA");
        System.out.println("11 -> select - JAVA/SANKHYA");
        System.out.println("12 -> select2 - JAVA/SANKHYA");
        System.out.println("13 -> timeout - JAVA");
        System.out.println("#################################");
        carrega();
    }
    void menuTime(){
        System.out.println("#################################");
        System.out.println("14 -> add - JAVA/SANKHYA");
        System.out.println("15 -> clearTime - SANKHYA");
        System.out.println("16 -> getNow - JAVA/SANKHYA");
        System.out.println("17 -> getToday - JAVA/SANKHYA");
        System.out.println("#################################");
        carrega();
    }
}