package projeto_maven_1;

public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto(
            1,
            "Água com gás",
            4.0,
            5,
            "Distribuidora"
        );
        
        System.out.println("\033[32mProduto cadastro com sucesso!\033[0m");
        System.out.println(
            "- ID: " + cadastroProduto.getId() + "\n" +
            "- Nome: " + cadastroProduto.getNome() + "\n" +
            "- Preco: " + cadastroProduto.getPreco() + "\n" +
            "- Quantidade em estoque: " + cadastroProduto.getQuantidadeEstoque() + "\n" +
            "- Fornecedor: " + cadastroProduto.getFornecedor()
        );
    }
}
