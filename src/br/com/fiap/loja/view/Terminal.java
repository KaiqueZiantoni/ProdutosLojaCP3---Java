package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Eletronico;
import br.com.fiap.loja.model.Livro;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Livro livro = new Livro("Homem de giz", 50.00, "Suspense policial baseado em busca por um assassino", false, true, "C. J. Tudor", "Intrínseca", "Suspense", true);
        Eletronico eletronico = new Eletronico("Iphone 17", 8900.00, "Smartphone apple", true, true, "Mobile", "Apple", "111XP43");

        Scanner leitor = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Você deseja:\n ** informações sobre os produtos(1) \n ** comprar produtos?(2)");
        String opcaoInicial = leitor.next() + leitor.nextLine();
        if (opcaoInicial.equals("1")){
            livro.exibirDetalhes();
            eletronico.exibirDetalhes();
        } else if (opcaoInicial.equals("2")) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Você deseja comprar Livros ou Eletronicos: ");
            String compra = leitor.next() + leitor.nextLine();

            if (compra.equalsIgnoreCase("Livros")) {
                System.out.println("INDICE: \n 1- Desconto por porcentagem \n 2- Cupom  \n 3- Estoque");
                System.out.println("Escolha a modalidade de desconto (1 , 2 ou 3) : ");
                String respostaDesconto = leitor.next() + leitor.nextLine();

                switch (respostaDesconto) {
                    case "1" -> {
                        System.out.println("Digte o valor da porcentagem que deseja aplicar de desconto: ");
                        int porcentagem = leitor.nextInt();
                        double precoFinal = livro.calcularDesconto(porcentagem);
                        System.out.println(" Nome do Produto:" + livro.getNome() + ". \n Valor inicial R$" + livro.getPreco() + "\n Garantia disponivel: " + livro.isGarantia() + "\n Valor final do livro com " + porcentagem + "% de desconto é de R$" + precoFinal);
                    }
                    case "2" -> {
                        System.out.println("Digite qual cupom deseja utilizar na compra: ");
                        String cupom = leitor.next() + leitor.nextLine();
                        double precoFinalCupom = livro.calcularDesconto(cupom);
                        System.out.println(" Nome do produto:" + livro.getNome() + ". \n Valor inicial R$" + livro.getPreco() + "\n Garantia disponivel: " + livro.isGarantia() + "\n Valor final do livro utilizando o cupom " + cupom + " foi de R$ " + precoFinalCupom);
                    }
                    case "3" -> {
                        System.out.println("Informe a quantidade em estoque do produto: ");
                        short qtdEstoque = leitor.nextShort();
                        double precoFinalEstoque = livro.calcularDesconto(qtdEstoque);
                        System.out.println("Nome do produto:" + livro.getNome() + ". \n Valor inicial R$" + livro.getPreco() + "\n Garantia disponivel: " + livro.isGarantia() + "\n Baseado na quantidade " + qtdEstoque + " de produtos no estoque, o valor final foi de : R$" + precoFinalEstoque);
                    }
                }
            } else if (compra.equalsIgnoreCase("Eletronicos")) {
                System.out.println("INDICE: \n 1- Desconto por porcentagem \n 2- Cupom  \n 3- Estoque");
                System.out.println("Escolha a modalidade de desconto (1 , 2 ou 3) : ");
                String respostaDesconto = leitor.next() + leitor.nextLine();

                switch (respostaDesconto) {
                    case "1" -> {
                        System.out.println("Digite o valor da porcentagem que deseja aplicar de desconto: ");
                        int porcentagem = leitor.nextInt();
                        double precoFinal = eletronico.calcularDesconto(porcentagem);
                        System.out.println(" Nome do Produto:" + eletronico.getNome() + ". \n Valor inicial R$" + eletronico.getPreco() + "\n Garantia disponivel: " + eletronico.isGarantia() + "\n Valor final do eletrônico com " + porcentagem + "% de desconto é de R$" + precoFinal);
                    }
                    case "2" -> {
                        System.out.println("Digite qual cupom deseja utilizar na compra: ");
                        String cupom = leitor.next() + leitor.nextLine();
                        double precoFinalCupom = eletronico.calcularDesconto(cupom);
                        System.out.println(" Nome do produto:" + eletronico.getNome() + ". \n Valor inicial R$" + eletronico.getPreco() + "\n Garantia disponivel: " + eletronico.isGarantia() + "\n Valor final do eletrônico utilizando o cupom " + cupom + " foi de R$ " + precoFinalCupom);
                    }
                    case "3" -> {
                        System.out.println("Informe a quantidade em estoque do produto: ");
                        short qtdEstoque = leitor.nextShort();
                        double precoFinalEstoque = eletronico.calcularDesconto(qtdEstoque);
                        System.out.println("Nome do produto:" + eletronico.getNome() + ". \n Valor inicial R$" + eletronico.getPreco() + "\n Garantia disponivel: " + eletronico.isGarantia() + "\n Baseado na quantidade " + qtdEstoque + " de produtos no estoque, o valor final foi de : R$" + precoFinalEstoque);
                    }
                }
            }

        }} }
