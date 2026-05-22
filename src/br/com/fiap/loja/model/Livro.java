package br.com.fiap.loja.model;

public class Livro extends Produto {
    private String autor;
    private String editora;
    private String generoLiterario;
    private boolean capaDura;


    public Livro(String nome, double preco, String descricao, boolean garantia, boolean produtoNovo,String autor, String editora, String generoLiterario, boolean capaDura){
        super(nome,preco , descricao, garantia, produtoNovo );
        this.autor = autor;
        this.capaDura = capaDura;
        this.editora = editora;
        this.generoLiterario = generoLiterario;

    }
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Gênero Literário: " + this.generoLiterario);
        System.out.println("Capa Dura: " + (this.capaDura));
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

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }
}