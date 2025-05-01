import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        int[] codigos = new int[10];
        String[] nomes = new String[10];
        int[] telefones = new int[10];


        while (continuar) {
            mostrarMenu();

            try {
                int opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Informe o código do contato:");
                        int codigo = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Informe o nome do contato:");
                        String nome = sc.nextLine();

                        System.out.println("Informe o telefone do contato:");
                        int telefone = sc.nextInt();

                        cadastrarContato(codigo, nome, telefone, codigos, nomes, telefones);

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
                        System.out.println("Escreva um número válido");
                }

            } catch (Exception erro) {
                System.out.println("Erro de leitura. Escreva uma opção válida :D");
            }

        }

    }

    public static void mostrarMenu() {

        System.out.println("=========================================");
        System.out.println("         MINHA AGENDA DE CONTATOS        ");
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

    public static void cadastrarContato(int codigo, String nome, int telefone, int[] codigos, String[] nomes, int[] telefones) {

        int i = 0;
        try {
            while(codigos[i] != 0) {
                i++;
            }
            codigos[i] = codigo;
            nomes[i] = nome;
            telefones[i] = telefone;

        }catch (Exception erro) {
            System.out.println("Limite de contatos cadastrados esgotado");
        }
    }
}
