import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Utilidade {

 public Connection conecta() throws SQLException{
                      Connection conexao = null;

        String url = "jdbc:mysql://192.200.63.121:3306/beleza";  //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = "123456"; //senha do MySQL
        try{
            conexao = DriverManager.getConnection(url, user, password);
}catch(SQLException sqlex){
System.out.println("Erro na conexão "+ sqlex);
}
        return conexao;
    }
     public void desconecta(Connection conexao){
     try{
     conexao.close();
     }catch(SQLException sqlex){
     System.out.println("Erro na conexão "+ sqlex);
   }
 }
}