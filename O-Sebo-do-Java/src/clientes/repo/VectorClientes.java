package clientes.repo;

import java.util.Vector;
import clientes.Cliente;

public class VectorClientes {
    
    private Vector<Cliente> clientes;
    
    public VectorClientes() {
        this.clientes = new Vector<Cliente>();
    }
    
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    
    public Cliente[] obterClientes() {
        Cliente[] listaClientes = null;
        
        if (this.quantidadeClientes() > 0) {
            listaClientes = new Cliente[this.quantidadeClientes()];
            for (int i = 0; i < this.quantidadeClientes(); i++) {
                listaClientes[i] = this.clientes.get(i);
            }
        }
        
        return listaClientes;
    }
    
    public int quantidadeClientes() {
        return this.clientes.size();
    }
    
}
