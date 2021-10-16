import java.util.Scanner;

public class testelicao {

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("|          Menu         |");
            System.out.println("|  Opções:              |");
            System.out.println("|        1. Opção 1     |");
            System.out.println("|        2. Opção 2     |");
            System.out.println("|        3. Sair        |");
            Scanner menu = new Scanner(System.in);

            System.out.print("Selecione uma opção:  ");

            opcao = menu.nextInt();

            if (opcao == 1)
                System.out.println("Opção 1 selecionada");

            if (opcao == 2)
                System.out.println("Opção 2 selecionada");

        } while (opcao != 3);

        switch (opcao) {
            case 1:
                System.out.print("Opção 1 selecionada");
                break;
            case 2:
                System.out.print("Opção 2 selecionada");
                break;
            case 3:
                System.out.print("Executado");
                break;
            default:
                System.out.print("Seleção inválida");
                break;

        }
    }
}