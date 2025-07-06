import dao.LivroDAO;
import model.Livro;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LivroDAO dao = new LivroDAO();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Gerenciamento de Livros");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Atualizar Livro");
            System.out.println("4 - Remover Livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Editora: ");
                    String editora = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    dao.inserir(new Livro(titulo, autor, editora, ano));
                    break;

                case 2:
                    List<Livro> livros = dao.listar();
                    for (Livro l : livros) {
                        System.out.printf("[%d] %s - %s (%s, %d)\n", l.getId(), l.getTitulo(), l.getAutor(), l.getEditora(), l.getAno());
                    }
                    break;

                case 3:
                    System.out.print("ID do livro: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo Título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Novo Autor: ");
                    String novoAutor = scanner.nextLine();
                    System.out.print("Nova Editora: ");
                    String novaEditora = scanner.nextLine();
                    System.out.print("Novo Ano: ");
                    int novoAno = scanner.nextInt();
                    dao.atualizar(new Livro(idAtualizar, novoTitulo, novoAutor, novaEditora, novoAno));
                    break;

                case 4:
                    System.out.print("ID do livro: ");
                    int idDeletar = scanner.nextInt();
                    dao.deletar(idDeletar);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}