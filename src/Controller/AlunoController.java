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
             
            String sql = "INSERT INTO alunos (Nome,Nascimento, Mes,Ano, Sexo, Telefone, Celular, Cpf, RG, Email, Endereço,Obs) VALUES (?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?)";
        	PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
			statement.setString(1, a.getNome());
			statement.setString(2, a.getNascimento());
			statement.setString(3, a.getMes());
                        statement.setString(4, a.getAno());
			statement.setString(5, a.getSexo());
			statement.setString(6, a.getTelefone());
                        statement.setString(7, a.getCelular());
                        statement.setString(8, a.getCpf());
                        statement.setString(9, a.getRG());
                        statement.setString(10, a.getEmail());
                        statement.setString(11, a.getEndereço());
			statement.setString(12, a.getObs());
			 
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
                   
                    String Nome = result.getString("Nome");
                    String Nascimento = result.getString("Nascimento");
                    String Mes = result.getString("Mes");
                    String  Ano = result.getString("Ano");
                    String  Sexo = result.getString("Sexo");
                    String  Telefone = result.getString("Telefone");
                    String  Celular = result.getString("Celular");
                    String  Cpf = result.getString("Cpf");
                    String  RG = result.getString("RG");
                    String  Email = result.getString("Email");
                    String  Endereço = result.getString("Endereço");
                    String  Obs = result.getString("Obs");
                     
                    String output = "Pessoa #%d: %s - %s - %s - %s - %s - %s";
                    System.out.println(String.format(output, ++count,Nome, Nascimento, Mes,Ano, Sexo, Telefone, Celular, Cpf, RG, Email, Endereço,Obs));                               
            }
        }
        } catch (SQLException e) {
      } 
    }
}