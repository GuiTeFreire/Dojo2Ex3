public class Livro {
    private String titulo, autor, editora, dataPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void detalhesLivro(){
        System.out.println("\nTítulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nEditora: " + this.editora +
                "\nData de Publicação: " + this.dataPublicacao);
    }

    public Livro(String titulo, String autor, String editora, String dataPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
    }
}
