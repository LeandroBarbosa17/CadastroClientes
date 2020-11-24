package br.com.unesa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro Barbosa <leandro97_cabral at hotmail.com>
 * @brief Classe clienteDAO
 * @date 19/11/2020
 */
public class ClienteDAO {
    private Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection("jdbc:derby://localhost:1527/Cadastro", "Cadastro", "Cadastro");
    }
    
    private void closeConnection(Connection c1){
        try{
            c1.close();
        } catch(SQLException ex){
            
        }
    }
    
    public void incluir(Cliente cliente){
        Connection c1 = null;
        try{
            c1 = getConnection();
            PreparedStatement st = c1.prepareStatement("INSERT INTO CLIENTE VALUES(?,?,?,?,?)");
            st.setInt(1, cliente.getId());
            st.setInt(2, cliente.getIdade());
            st.setString(3, cliente.getNome());
            st.setString(4, cliente.getTelefone());
            st.setString(5, cliente.getEmail());
            st.executeUpdate();
        } catch(ClassNotFoundException | SQLException ex){
            
        } finally{
            closeConnection(c1);
        }
    }
    
    public void excluir(int codigo){
        Connection c1 = null;
        try{
            c1 = getConnection();
            PreparedStatement st = c1.prepareStatement("DELETE FROM CLIENTE WHERE ID = ?");
            st.setInt(1, codigo);
            st.executeUpdate();
        } catch(ClassNotFoundException | SQLException ex){
            
        } finally{
            closeConnection(c1);
        }
    }
    
    public List<Cliente> listar(){
        ArrayList<Cliente> clientes = new ArrayList();
        Connection c1 = null;
        
        try{
            c1 = getConnection();
            Statement st = c1.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM CLIENTE");
            
            while(rs.next()) clientes.add(new Cliente(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        
        } catch (ClassNotFoundException | SQLException ex){
            
        } finally{
            closeConnection(c1);
        }
        
        return clientes;
    }
}
