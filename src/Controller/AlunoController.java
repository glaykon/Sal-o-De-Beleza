package Controller;

import Config.Utilidade;
import Model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlunoController {
          @SuppressWarnings("ConvertToTryWithResources")
           public void inserir(Aluno a) throws SQLException {
        try {
            // inicio Coneca com banco 
            Utilidade util = new Utilidade(); 
            Connection conexao = util.conecta();
             
            String sql = "INSERT INTO alunos (nome, endereco, cpf, telefone, matricula) VALUES (?, ?, ?, ?, ?)";
        	PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
			statement.setString(1, a.getNome());
			statement.setString(2, a.getEndereco());
			statement.setString(3, a.getCpf());
			statement.setString(4, a.getTelefone());
			statement.setString(5, a.getMatricula());
			
			 
			int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
			if (rowsInserted > 0) {
				System.out.println("Novo usuário inserido com sucesso");
			}
       //fecha a conexão
        statement.close();
        conexao.close();
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        }
    } 

    public void selectPessoa()throws SQLException {
        try {
            String sql = "SELECT * FROM pessoa";
             Utilidade util= new Utilidade(); //inicializa classe Utilidade
        try (Connection conexao = util.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                   
                    String nome = result.getString("nome");
                    String endereco = result.getString("endereco");
                    String cpf = result.getString("cpf");
                    String  telefone = result.getString("telefone");
                    String  matricula = result.getString("matricula");
                     
                    String output = "Pessoa #%d: %s - %s - %s - %s - %s - %s";
                    System.out.println(String.format(output, ++count, nome, endereco, cpf, telefone,  matricula));                               
            }
        }
        } catch (SQLException e) {
      } 
    }
}