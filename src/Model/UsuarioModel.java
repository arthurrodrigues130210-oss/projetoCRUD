package Model;


import java.sql.Date;



public class UsuarioModel {
private int idUsurio;
private String nome;
private String cpf;
private String email;
private String telefone;
private Date nascimento;

    public int getIdUsurio() {
        return idUsurio;
    }

    public void setIdUsurio(int idUsurio) {
        this.idUsurio = idUsurio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
}