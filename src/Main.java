import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean parar = true;
        Hotel hotel = new Hotel();
        int numero;



        while (parar) {
            System.out.println("==========================");
            System.out.println("     Sistema de hotel     ");
            System.out.println("==========================");

            System.out.println("[1] - Cadastrar quarto");
            System.out.println("[2] - Listar quarto");
            System.out.println("[3] - Reservar quarto");
            System.out.println("[4] - Cancelar quarto");
            System.out.println("[0] - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número do quarto: ");
                    numero = sc.nextInt();

                    System.out.println("Escolha o tipo do quarto: ");
                    System.out.println("[1] -  simples");
                    System.out.println("[2] -  duplo");
                    System.out.println("[3] -  luxo");

                    int tipoOpcao = sc.nextInt();
                    String tipo = "";

                    if (tipoOpcao == 1) {
                        tipo = "simples";
                    } else if (tipoOpcao == 2) {
                        tipo = "duplo";
                    } else if (tipoOpcao == 3) {
                        tipo = "luxo";
                    } else {
                        System.out.println("Opção inválida");
                        System.out.println("Repita o cadastro com uma opção válida");
                        continue;
                    }

                    Quarto quarto = new Quarto(numero, tipo);
                    hotel.adicionarQuarto(quarto);
                    System.out.println("Quarto cadastrado com sucesso!");
                    break;

                case 2:
                    hotel.listarQuartos();
                    break;
                case 3:
                    System.out.println("Digite o número do quarto:");
                    numero = sc.nextInt();
                    hotel.reservarQuarto(numero);
                    break;
                case 4:
                    System.out.println("Digite o número do quarto:");
                    numero = sc.nextInt();
                    hotel.cancelarReserva(numero);
                    System.out.println("Cancelamento efetuado com sucesso!");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    parar = false;
                    break;
            }
        }
    }
}