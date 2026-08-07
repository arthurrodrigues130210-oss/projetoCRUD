package controller;

import Model.UsuarioModel;
import dao.UsuarioDao;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class TesteConexao {

    public static void main(String[] args)throws SQLException{

        Connection connection = new ConnectionMySql().getConnection();
        JOptionPane.showMessageDialog(null, "Conexão Estabelecida!");

        connection.close();
        
        
        UsuarioModel u1 = new UsuarioModel();
        UsuarioDao ud = new UsuarioDao(connection);
        u1.setNome("Marina Sena");
        u1.setCpf("676.454.909-69");
        u1.setEmail("Emsena@gmail.com");
        u1.setTelefone("(34)40028922");
        u1.setNascimento(Date.valueOf("2026-08-06"));
        ud.adicionar(u1);

    }
}
