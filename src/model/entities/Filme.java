package model.entities;

public class Filme extends Locadora {

    public Filme(Integer id, String nome, String genero, Double valor) {
        super(id, nome, genero, valor);
    }

    @Override
    public String toString() {
        return "Filme: " + super.toString();
    }
}
