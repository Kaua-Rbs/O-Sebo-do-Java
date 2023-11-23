package sistema;
    
import clientes.repo.VectorClientes;
import vendas.repo.VectorVendas;
import livros.repo.*;

public class GerenciadorLivraria {
    
    private VectorClientes clientes;
    private VectorLivros livros;
    private EstoqueLivros estoque;
    private VectorVendas vendas;
    
    public GerenciadorLivraria(VectorClientes clientes, VectorLivros livros, EstoqueLivros estoque, VectorVendas vendas) {
        this.clientes = clientes;
        this.livros = livros;
        this.estoque = estoque;
        this.vendas = vendas;
    }
    
    public void cadastrarCliente(String nome, String CPF, String login, String senha) {
    }
    
    public void cadastrarLivro() {
    }
    
    public void realizarVenda() {
    }
    
    public void livrosDisponiveis() {
    }
    
    public void livrosMaisVendidos() {
    }
     
    public void pesquisarLivro() {
    }
    
}
