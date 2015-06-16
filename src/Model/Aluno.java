package Model;

public class Aluno {
    
    
     String nome,endereco,telefone, cpf,matricula;
    private String genero;
     
public Aluno(String nome, String endereco, String cpf, String telefone,String matricula) {
        this.nome = nome;
        this.endereco = endereco;      
        this.cpf = cpf;
         this.telefone = telefone;
        this.matricula = matricula;
    }

    public String getnome() {
        return nome;
    }

    public void setNOME(String nome) {
        this.nome = nome;
    }

    public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

         public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String  matricula) {
        this.matricula = matricula;
    }
}