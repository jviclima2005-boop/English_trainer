import java.util.Scanner;

public class English{

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
                    System.out.println("Digite uma palavra em inglês: ");
                    String palavra = sc.nextLine();
                    if(palavra.equals("dog")){
                        System.out.println("cachorro");
                    }else if(palavra.equals("cat")){
                        System.out.println("gato");
                    }else if(palavra.equals("horse")){
                        System.out.println("cavalo");
                    }else if(palavra.equals("lion")){
                        System.out.println("leão");
                    }else if(palavra.equals("duck")){
                        System.out.println("pato");
                    }else if(palavra.equals("elephant")){
                        System.out.println("elefante");
                    }else if(palavra.equals("giraffe")){
                        System.out.println("girafa");
                    }else if(palavra.equals("monkey")){
                        System.out.println("macaco");
                    }else if(palavra.equals("Tiger")){
                        System.out.println("tigre");
                    }else if(palavra.equals("bear")){
                        System.out.println("urso");
                    }else if(palavra.equals("wolf")){
                        System.out.println("lobo");
                    }else if(palavra.equals("fox")){
                        System.out.println("raposa");
                    }else if(palavra.equals("deer")){
                        System.out.println("veado");
                    }else if(palavra.equals("rabbit")){
                        System.out.println("coelho");
                    }else if(palavra.equals("kangaroo")){
                        System.out.println("canguru");
                    }else if(palavra.equals("leopard")){
                        System.out.println("leopardo");
                    }else if(palavra.equals("crocodile")){
                        System.out.println("crocodilo");
                    }else if(palavra.equals("alligator")){
                        System.out.println("jacaré");
                    }else if(palavra.equals("eagle")){
                        System.out.println("águia");
                    }else if(palavra.equals("owl")){
                        System.out.println("coruja");
                    }else if(palavra.equals("penguin")){
                        System.out.println("pinguim");
                    }else if(palavra.equals("shark")){
                        System.out.println("tubarao");
                    }else if(palavra.equals("whale")){
                        System.out.println("baleia");
                    }else{
                        System.out.println("opção inválida");
                        System.out.println("Invalid option");
                    }
                    break;
                case 2:
                    System.out.println("Qual é a tradução de 'house'?");
                    System.out.println("1 - casa");
                    System.out.println("2 - carro");
                    System.out.println("3 - comida");

                    int resposta = sc.nextInt();

                    if(resposta == 1){
                        System.out.println("Correto");
                    }else{
                        System.out.println("Errado!");
                    }

                    System.out.println("Qual é a tradução de 'moon'?");
                    System.out.println("1 - sol");
                    System.out.println("2 - marte");
                    System.out.println("3 - lua");

                    int resposta02 = sc.nextInt();

                    if(resposta02 == 3){
                        System.out.println("Correto!");
                    }else{
                        System.out.println("Errado!");
                    }
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