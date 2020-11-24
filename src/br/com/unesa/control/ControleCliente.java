package br.com.unesa.control;

import br.com.unesa.model.Cliente;
import br.com.unesa.model.ClienteDAO;
import java.util.List;


/**
 *
 * @author Leandro Barbosa <leandro97_cabral at hotmail.com>
 * @brief Classe controle
 * @date 19/11/2020
 */
public class ControleCliente {
    private ClienteDAO dao = new ClienteDAO();
    
    public void incluir(Cliente cliente){
        dao.incluir(cliente);
    }
    
    public void excluir(int id){
        dao.excluir(id);
    }
    
    public List<Cliente> ObterTodos(){
        return dao.listar();
    }
}
