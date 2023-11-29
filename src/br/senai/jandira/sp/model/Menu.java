package br.senai.jandira.sp.model;

import java.util.Scanner;
public class Menu {

    public void Menu() {
        Scanner teclado = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();
        Usuarios usuarios = new Usuarios();
        Biblioteca biblioteca = new Biblioteca();

        boolean continuar = true;

        while (continuar) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("----------------- BEM VINDO Á BIBLIOTECA ------------------");
            System.out.println("Quais das opções você deseja utilizar?");
            System.out.println("");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar Livro");
            System.out.println("3 - Consultar Livros");
            System.out.println("4 - Empréstimos");
            System.out.println("5 - SAIR");
            System.out.println("-----------------------------------------------------------");

            int userOption = teclado.nextInt();

            Livros livros = new Livros();

            switch (userOption) {

                case 1:
                    cadastro.UsuariosCadastro();
                    break;

                case 2:
                    cadastro.CadastrarLivros(livros);
                    biblioteca.AdicionarLivro(livros);
                    break;

                case 3:
                    biblioteca.ConsultarLivro();
                    break;

                case 4:
                    cadastro.EmprestimoLivro();
                    break;

                case 5:
                    continuar = false;
                    break;
            }


        }
    }
}
