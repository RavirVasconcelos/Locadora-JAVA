package model.entities;

public class Locadora {

    private Integer id;
    private String nome;
    private String genero;
    private Double valor;

    public Locadora(Integer id, String nome, String genero, Double valor) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "ID " + id +
                ", Nome: " + nome +
                ", Gênero: " + genero +
                String.format(" Preço: R$ %.2f", valor);
    }
}
