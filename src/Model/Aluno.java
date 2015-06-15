package Model;

public class Aluno {
    
    
     String nome,endereco,genero;
     int telefone, cpf,matricula;
   


 public Aluno(String nome, String endereco, int matricula, int telefone, int cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
        this.telefone = telefone;
        this.cpf = cpf;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}