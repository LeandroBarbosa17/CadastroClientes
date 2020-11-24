package br.com.unesa.model;

/**
 *
 * @author Leandro Barbosa <leandro97_cabral at hotmail.com>
 * @brief Classe cliente
 * @date 19/11/2020
 */
public class Cliente {
    public int id;
    public int idade;
    public String nome;
    public String telefone;
    public String email;
    
    public Cliente(){
        
    }
    
    public Cliente(int id, int idade, String nome, String telefone, String email){
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
