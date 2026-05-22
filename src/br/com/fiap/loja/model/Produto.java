package br.com.fiap.loja.model;

public class Produto {
    private String nome;
    protected double preco;
    private String descricao;
    private boolean garantia;
    private boolean produtoNovo;


    public Produto(String nome, double preco, String descricao, boolean garantia, boolean produtoNovo){
        this.nome = nome;
        this.descricao = descricao;
        this.garantia = garantia;
        this.produtoNovo = produtoNovo;
        this.preco = preco;
    }
    public double calcularDesconto(int porcentagem){
        return preco - (preco*porcentagem/100);
    }



    public double calcularDesconto(String cupomBemVindo){
        int porcentagem =0;
                if (cupomBemVindo.equals("BEMVINDO")){
                    porcentagem = 40;


                }return calcularDesconto(porcentagem);
    }

    public double calcularDesconto(short qtdEstoque){
        int porcentagem = 0;
            if (qtdEstoque > 10 && qtdEstoque <=50) {
                porcentagem = 5;
            } else if (qtdEstoque > 50){
                porcentagem = 10;

            }return calcularDesconto(porcentagem);

    }

    public void exibirDetalhes() {
        System.out.println("\n--- DETALHES DO PRODUTO ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço original: R$ " + this.preco);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Garantia: " + (this.garantia ));
        System.out.println("Produto Novo: " + (this.produtoNovo));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public boolean isProdutoNovo() {
        return produtoNovo;
    }

    public void setProdutoNovo(boolean produtoNovo) {
        this.produtoNovo = produtoNovo;
    }
}
