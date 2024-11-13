package projeto_maven_1;

public class CadastroProduto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String fornecedor;

    
    // Construtores
    public CadastroProduto() {
    }

    public CadastroProduto(int id, String nome, double preco, int quantidadeEstoque, String fornecedor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.fornecedor = fornecedor;
    }

    public CadastroProduto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getFornecedor() {
        return fornecedor;
    }


    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
