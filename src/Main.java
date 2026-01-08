import java.util.Scanner;

public class Main {
    void main(){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Olá! Deseja ver qual raça?");
            System.out.println("""
          [1] Saiyajin
          [2] Humano
          [0] Sair
          \n
          """);

            String valor1 = scan.nextLine();

            if (valor1.equals("1") || valor1.equalsIgnoreCase("saiyajin")) {

                System.out.println("""
              [1] Goku
              [0] Voltar\n
              """);

                String escolhaSaiyajin = scan.nextLine();

                if (escolhaSaiyajin.equals("1") || escolhaSaiyajin.equalsIgnoreCase("goku")) {
                    Saiyajin saiyajin = new Saiyajin();
                    System.out.println("------//------");
                    saiyajin.goku();
                    System.out.println("------//------");
                }

            }
            else if (valor1.equals("2") || valor1.equalsIgnoreCase("humano")) {

                System.out.println("""
              [1] Kuririn
              [0] Voltar
              """);

                String escolhaHumano = scan.nextLine();

                if (escolhaHumano.equals("1") || escolhaHumano.equalsIgnoreCase("kuririn")) {
                    Humano humano = new Humano();
                    System.out.println("------//------");
                    humano.kuririn();
                    System.out.println("------//-------");
                }

            }
            else if (valor1.equals("0")) {
                System.out.println("Encerrando...");
                break;
            }
            else {
                System.out.println("Opção inválida!");
            }
        }

        scan.close();
    }
}