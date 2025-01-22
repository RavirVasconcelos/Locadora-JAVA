package model.entities;

public class Livro extends Locadora {

    public Livro(Integer id, String nome, String genero, Double valor) {
        super(id, nome, genero, valor);
    }

    @Override
    public String toString() {
        return "Livro: " + super.toString();
    }
}
