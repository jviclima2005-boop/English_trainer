import java.util.Scanner;

public class Fitnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        while(opcao != 0){
            System.out.println("    |==============MENU==============|");
            System.out.println("1 - | Calcular IMC                   |");
            System.out.println("2 - | Calcular o consumo de creatina |");
            System.out.println("3 - | Vamos fazer um calculo de consumo |");
            System.out.println("4 - | Quantas calorias devo ingerir  |");
            System.out.println("5 - | Consumo de água por dia        |");
            System.out.println("0 - |      Encerrar atividades       |");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

        if(opcao == 1){
        
        System.out.println("(kg)| Digite o seu peso:");
        double peso = sc.nextDouble();

        System.out.println("(m)| Digite a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

            if(imc < 18.5){
                System.out.println(" Você está Abaixo do peso");
            }else if(imc < 25){
                System.out.println(" Você está no Peso normal");
            }else{
                System.out.println("Você está em Sobrepeso");
            }
            
        }else if(opcao == 2){
           System.out.println("Digite seu peso(kg): ");
           double peso = sc.nextDouble();

           double creatina = peso * 0.03;

           System.out.printf("Dose diaria de creatina:%.1f %n ", creatina);
        }else if(opcao == 3){
            int num = 1;
            while(num != 0){
                System.out.println("\n===FAIXAS POR KG DE PROTEÍNA===");
                System.out.println("1 - Básico saúdavel");
                System.out.println("2 - Consumo para hipertrofia");
                System.out.println("3 - Consumo para atleta");
                System.out.println("===FAIXAS POR KG DE GORDURA===");
                System.out.println("4 - Calcular consumo de gordura");
                System.out.println("===FAIXAS POR KG DE CARBOIDRATO===");
                System.out.println("5 -| Calcular consumo de carboidrato |");
                System.out.println("0 - | Finalizar |");
                System.out.println("===================================");
                System.out.print("Escolha: ");
                num = sc.nextInt();
                

                if(num == 1){
                    System.out.println("\n(kg)| Digite seu peso: \n");
                    double ps = sc.nextDouble();
                    double proteina = ps * 1.6;
                    System.out.println("\nConsumo de proteína para ser saúdavel: "+ proteina);
                }else if(num == 2){
                    System.out.println("\n(kg)| Digite seu peso: \n");
                    double ps = sc.nextDouble();
                    double proteina = ps*2.0;
                    System.out.println("\nConsumo de proteína para hipertrofia: " + proteina);
                }else if(num == 3){
                    System.out.println("\n(kg)| Digite seu peso: \n");
                    double ps = sc.nextDouble();
                    double proteina = ps*2.2;
                    System.out.println("\nConsumo de proteína para um atleta: " + proteina);
                }else if(num == 0){
                    System.out.println("\nEncerrando...\n");
                }else if(num == 4){
                    System.out.println("(kg) | Digite seu peso |");
                    double ps = sc.nextDouble();
                    double gordura = ps * 0.8;
                    System.out.println("\nConsumo ideal de gordura: " + gordura);
                }else if(num ==5){ 
                    System.out.println("Primeiro vamos calcular o consumo diario de calorias");
                    System.out.println("(kg) | Digite seu peso |");
                    double ps = sc.nextDouble();
                    System.out.println("(m) - | Digite sua altura |");
                    double alt = sc.nextDouble();
                    System.out.println("Digite sua idade:");
                    int idade = sc.nextInt();
                    System.out.println(" | 1.2 - Sedentário |");
                    System.out.println("| 1.55 - Treino normal |");
                    System.out.println("| 1.7 - Treino pesado|");
                    System.out.println("Digite o número referente a seu nível de atividade:");
                    double atividade = sc.nextDouble();
                    double calorias = ((10 *ps) + (6.25 * (alt * 100)) - (5 * idade) + 5) * atividade + 300;
                    System.out.println("\nConsumo ideal de calorias: " + calorias);

                    int a2 = 1;
                    while(a2 !=0){
                        System.out.println("1 - | Vamos calcular o carbo |");
                        System.out.println("0 - | Finalizar |");
                        a2 = sc.nextInt();

                        if(a2 == 1){
                            double proteina = ps * 2.0;
                            double gordura = ps * 0.8;
                            double carbo = (calorias -(proteina * 4 + gordura * 9)) / 4;
                            System.out.printf("Carboidrato: %.2f g%n", carbo);
                        }else if(a2 == 0){
                            System.out.println("Encerrando...");
                        }else{
                            System.out.println("Erro ");
                        }
                    }
    
                
                
            }else if(opcao == 4){

                System.out.println("");

            }else if(opcao == 5){

                System.out.println("\nEncerrando...\n");
            }else if(opcao == 0){
                System.out.println("Encerrando...");
            }else{
                System.out.println("Digitação invalida");
            }
        }
        sc.close();
        }
    }
    }
}


