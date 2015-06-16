package Model;

public class Venda {
    
    int idVenda, quantidade, valor;
    String nome;

    public Venda(int idVenda, int quantidade, int valor, String nome) {
        this.idVenda = idVenda;
        this.quantidade = quantidade;
        this.valor = valor;
        this.nome = nome;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}