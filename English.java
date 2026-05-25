import java.util.Scanner;

public class English{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        while(opcao != 0){
            System.out.println("=== ENGLISH TRAINER ===");
            System.out.println("| 1 - EXPANDIR VOCABULARIO |");
            System.out.println("| 2 - Quiz                 |");
            System.out.println("| 0 - Sair                 |");
            System.out.println("===========================");
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

                int opcao = 1;

                String [] inglesAnimias = {"lion","dog","duck","horse","cat"};
                String [] portuguesAnimias = {"leão","cachorro","pato","cavalo","gato"};

                String [] inglesObjeto = {"calculator","charger","fan","curtain","bottle"};
                String [] portuguesObjetos = {"calculadora","carregador","ventilador","cortina","bottle"};

                System.out.println("== EXPANDINDO VOCABULARIO EM INGLêS ==");
                while(opcao != 0){
                    System.out.println("== MENU ==");
                    System.out.println("1 - nome de animais");
                    System.out.println("2 - nome de objetos");
                    System.out.println("0 - encerrar");
                    System.out.print("escolha: ");
                    opcao = sc.nextInt();

                    if(opcao ==1){
                        for(int i = 0; i < portuguesAnimias.length; i++){
                        System.out.println(portuguesAnimias[i] + " = " + inglesAnimias[i]);
                        }
                    }
                
                    if(opcao == 2){
                        for(int i = 0; i < portuguesObjetos.length; i++){
                      System.out.println(portuguesObjetos[i] + " = " + inglesObjeto[i]);
                        }
                    }
                    if(opcao == 0){
                        System.out.println("encerrando...");
                    }
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