package model.entities;

public class Serie extends Locadora {

    public Serie(Integer id, String nome, String genero, Double valor) {
        super(id, nome, genero, valor);
    }

    @Override
    public String toString() {
        return "Serie: " + super.toString();
    }
}
