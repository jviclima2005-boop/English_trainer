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
                    System.out.println("\n== Apenas palavras de animais ==");
                    System.out.println("Digite uma palavra em inglês: ");
                    String palavra = sc.nextLine();
                    if(palavra.equals("Dog")){
                        System.out.println("Cachorro");
                    }else if(palavra.equals("Cat")){
                        System.out.println("Gato");
                    }else if(palavra.equals("Horse")){
                        System.out.println("Cavalo");
                    }else if(palavra.equals("Lion")){
                        System.out.println("Leão");
                    }else if(palavra.equals("Duck")){
                        System.out.println("Pato");
                    }else if(palavra.equals("Elephant")){
                        System.out.println("Elefante");
                    }else if(palavra.equals("Giraffe")){
                        System.out.println("Girafa");
                    }else if(palavra.equals("Monkey")){
                        System.out.println("Macaco");
                    }else if(palavra.equals("Tiger")){
                        System.out.println("Tigre");
                    }else if(palavra.equals("Bear")){
                        System.out.println("Urso");
                    }else if(palavra.equals("Wolf")){
                        System.out.println("Lobo");
                    }else if(palavra.equals("Fox")){
                        System.out.println("Raposa");
                    }else if(palavra.equals("Deer")){
                        System.out.println("Veado");
                    }else if(palavra.equals("Rabbit")){
                        System.out.println("Coelho");
                    }else if(palavra.equals("Kangaroo")){
                        System.out.println("Canguru");
                    }else if(palavra.equals("Leopard")){
                        System.out.println("Leopardo");
                    }else if(palavra.equals("Crocodile")){
                        System.out.println("Crocodilo");
                    }else if(palavra.equals("Alligator")){
                        System.out.println("Jacaré");
                    }else if(palavra.equals("Eagle")){
                        System.out.println("Águia");
                    }else if(palavra.equals("Owl")){
                        System.out.println("Coruja");
                    }else if(palavra.equals("Penguin")){
                        System.out.println("Pinguim");
                    }else if(palavra.equals("Shark")){
                        System.out.println("Tubarao");
                    }else if(palavra.equals("Whale")){
                        System.out.println("Baleia");
                    }else{
                        System.out.println("opção inválida");
                        System.out.println("Invalid option");
                    }
                    break;
                case 2:
                    System.out.println("== Qual é a tradução de 'House'? ==");
                    System.out.println("1 - | Casa");
                    System.out.println("2 - | Carro");
                    System.out.println("3 - | Comida");

                    int resposta = sc.nextInt();

                    if(resposta == 1){
                        System.out.println("Correto");
                    }else{
                        System.out.println("Errado!");
                    }

                    System.out.println("== Qual é a tradução de 'Moon'? ==");
                    System.out.println("1 - | Sol");
                    System.out.println("2 - | Marte");
                    System.out.println("3 - | Lua");

                    int resposta02 = sc.nextInt();

                    if(resposta02 == 3){
                        System.out.println("Correto!");
                    }else{
                        System.out.println("Errado!");
                    }

                    System.out.println("== Qual é a tradução de 'Apple'? ==");
                    System.out.println("1 - | Banana");
                    System.out.println("2 - | Carne");
                    System.out.println("3 - | Maça");

                    int resposta03 = sc.nextInt();

                    if(resposta03 == 3){
                        System.out.println("Correto!");
                    }else{
                        System.out.println("Errado!");
                    }

                    System.out.println("== Qual é a tradução de 'Eat'? ==");
                    System.out.println("1 - | Comida");
                    System.out.println("2 - | Comer");
                    System.out.println("3 - | Correr");

                    int resposta04 = sc.nextInt();

                    if(resposta04 == 2){
                        System.out.println("Correto!");
                    }else{
                        System.out.println("Errado");
                    }

                    System.out.println("== Qual é a tradução 'Head'? ==");
                    System.out.println("1 - | Coração");
                    System.out.println("2 - | Cabeça");
                    System.out.println("3 - | Pé");

                    int resposta05 = sc.nextInt();

                    if(resposta05 == 2){
                        System.out.println("Correto!");
                    }else{
                        System.out.println("Errado!");
                    }
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
}
