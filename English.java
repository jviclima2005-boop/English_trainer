import java.util.Scanner;

public class English{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        while(opcao != 0){
            System.out.println("=== ENGLISH TRAINER ===");
            System.out.println("| 1 - Traduzir palavra |");
            System.out.println("| 2 - Quiz             |");
            System.out.println("| 0 - Sair             |");
            System.out.println("========================");
            System.out.print("  Escolha:");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    traduzir(sc);
                    break;
                case 2:
                    quiz(sc);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        sc.close();
    }


            public static void traduzir(Scanner sc){
                System.out.println("=== TRADUZIR NOME DE ANIMAIS ==");
                System.out.println("Digite uma palavra em inglês:");
                String palavra = sc.nextLine().toLowerCase();

                switch (palavra) {
                    case "dog":
                        System.out.println("Cachorro");
                        break;
                    case "cat":
                        System.out.println("Gato");
                        break;
                    case "tiger":
                        System.out.println("Tigre");
                        break;
                    case "elephant":
                        System.out.println("Elefante");
                        break;
                    case "duck":
                        System.out.println("Pato");
                        break;
                    case "fox":
                        System.out.println("Raposa");
                        break;
                    case "shark":
                        System.out.println("Tubarão");
                        break;
                    case "lion":
                        System.out.println("Leão");
                        break;
                    case "Kangaroo":
                        System.out.println("Canguru");
                        break;
                    case "bird":
                        System.out.println("Pássaros");
                        break;
                    case "bear":
                        System.out.println("Urso");
                        break;
                    case "snake":
                        System.out.println("Cobra");
                        break;
                    case "frog":
                        System.out.println("Sapo");
                        break;
                    case "whale":
                        System.out.println("Baleia");
                        break;
                    case "eagle":
                        System.out.println("Águia");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }

            public static void quiz(Scanner sc){
                int pontos = 0;

                System.out.println("\n=== QUIZ DE INGLÊS ===\n");

                //pergunta 01
                System.out.println("Qual a tradução de 'house'?");
                System.out.println("1 - Casa");
                System.out.println("2 - Comida");
                System.out.println("3 - Camisa");
                int r1 = sc.nextInt();

                if(r1 == 1){
                    System.out.println("Correto!!");
                    pontos++;
                }else{
                    System.out.println("Errado!");
                }

                //pergunta 02
                System.out.println("Qual é a tradução de 'moon'?");
                System.out.println("1 - Fogo");
                System.out.println("2 - Sol");
                System.out.println("3 - Lua");
                int r2 = sc.nextInt();

                if(r2 == 3){
                    System.out.println("Correto!");
                    pontos++;
                }else{
                    System.out.println("Errado!");
                }

                System.out.println("Qual é a tradução de 'eat'?");
                System.out.println("1 - Comida");
                System.out.println("2 - Comer");
                System.out.println("3 - Caramelo");
                int r3 = sc.nextInt();

                if(r3 == 2){
                    System.out.println("Correto!");
                    pontos++;
                }else{
                    System.out.println("Errado!");
                }

                //resultado final 
                System.out.println("Seus ponto: "+ pontos + "/3");
    }
}