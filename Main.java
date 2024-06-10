import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            if (opcao == 1) {
                System.out.print("Digite o nome do item para adicionar: ");
                String item = scanner.nextLine();
                lista.adicionarItem(item);
            } else if (opcao == 2) {
                System.out.print("Digite o nome do item para remover: ");
                String item = scanner.nextLine();
                lista.removerItem(item);
            } else if (opcao == 3) {
                lista.exibirLista();
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

