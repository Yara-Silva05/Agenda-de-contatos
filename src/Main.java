import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        while (continuar) {
            mostrarMenu();

            try {
                int opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        break;
                    case 6:
                        System.out.println("");
                        break;
                    case 7:
                        continuar = false;
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Escreva um némero válido");
                }

            }
            catch (Exception erro) {
                System.out.println("Erro de leitura. Escreva uma opção válida :D");
            }

        }

    }
    public static void mostrarMenu() {
        System.out.println("=========================================");
        System.out.println("         MINHA AGENDA DE CONTATOS         ");
        System.out.println("=========================================");
        System.out.println("=  1 - Novo Contato                     =");
        System.out.println("=  2 - Alterar Contato                  =");
        System.out.println("=  3 - Excluir Contato                  =");
        System.out.println("=  4 - Listar Todos os Contatos         =");
        System.out.println("=  5 - Listar por Código do Contato     =");
        System.out.println("=  6 - Listar por Nome do Contato       =");
        System.out.println("=  7 - Sair                             =");
        System.out.println("=========================================");
        System.out.print("Escolha a Opção: ");
    }
}
