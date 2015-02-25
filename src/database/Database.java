/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    private Connection conexao;
    private String url = "jdbc:mysql://localhost:3306/livraria";
    private String user = "root" ;
    private String password = "thales01";
    private static Database instancy;
    
    private Database() {
        //O registro do driver com o uso do Class.forNane a partir do Java 6 tornou-se desnecessário
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Driver não encontrado. Entre em contato com o Administrador do sistema e informe esse erro.");
        }
        try{
            this.conexao = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. Entre em contato com o Administrador do sistema e informe esse erro.\n" + e.getMessage());
        }
    }
    
    public static Database getInstancy(){
        if (instancy == null){
            instancy = new Database();
        }
        return instancy;
    }
    
    public Connection getconexao(){
        return this.conexao;
    }
}
