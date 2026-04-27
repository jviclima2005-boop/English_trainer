import java.util.Scanner;

public class Ex03{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        while(opcao != 0){
            System.out.println("=== ENGLISH TRAINER ===");
            System.out.println("1 - Traduzir palavra");
            System.out.println("2 - Quiz");
            System.out.println("0 - Sair");
            System.out.print("Escolha:");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    traduzir(sc);        
                    break;
                case 2:
                    quiz(sc);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}