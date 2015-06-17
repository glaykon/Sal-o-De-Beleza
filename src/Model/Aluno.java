package Model;

public class Aluno {
    
    
     String Nome,Nascimento, Mes,Ano, Sexo, Telefone, Celular, Cpf, RG, Email, Endereço,Obs;

    public Aluno(String Nome, String Nascimento, String Mes, String Ano, String Sexo, String Telefone, String Celular, String Cpf, String RG, String Email, String Endereço, String Obs) {
        this.Nome = Nome;
        this.Nascimento = Nascimento;
        this.Mes = Mes;
        this.Ano = Ano;
        this.Sexo = Sexo;
        this.Telefone = Telefone;
        this.Celular = Celular;
        this.Cpf = Cpf;
        this.RG = RG;
        this.Email = Email;
        this.Endereço = Endereço;
        this.Obs = Obs;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

}