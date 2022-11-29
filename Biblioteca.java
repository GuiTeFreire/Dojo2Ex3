import java.util.Scanner;

public class Biblioteca implements Aluguel {
    private Cliente[] clientes;
    private Livro[] livros = new Livro[1000];

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void insereLivro(){
        Scanner teclado = new Scanner(System.in);
        String titulo, autor, editora, dataPublicacao;
        System.out.println("Titulo do Livro: ");
        titulo = teclado.nextLine();
        System.out.println("Autor do Livro: ");
        autor = teclado.nextLine();
        System.out.println("Editora do Livro: ");
        editora = teclado.nextLine();
        System.out.println("Data de publicação do Livro: ");
        dataPublicacao = teclado.nextLine();
        Livro l = new Livro(titulo, autor, editora, dataPublicacao);
        for (int i = 0; i < livros.length; i++){
            if (livros[i] == null)
                livros[i] = l;
        }
    }



    public void alugaLivro() {

    }
}
