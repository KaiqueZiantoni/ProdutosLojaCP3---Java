package br.com.fiap.loja.model;

public class Eletronico extends Produto{
    private String categoria;
    private String fabricante;
    private String numeroDeSerie;

    public Eletronico(String nome, double preco, String descricao, boolean garantia, boolean produtoNovo, String categoria, String fabricante, String numeroDeSerie) {
        super(nome, preco, descricao, garantia, produtoNovo);
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.numeroDeSerie = numeroDeSerie;
    }

    public double calcularDesconto(String cupom) {
        int porcentagem = 20;
        if (cupom.equals("NERD")) {
            return getPreco() - (getPreco() * porcentagem / 100);
        } else {
            return super.calcularDesconto(cupom);
        }
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Número de Série: " + this.numeroDeSerie);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
}