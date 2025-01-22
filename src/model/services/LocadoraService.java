package model.services;

import model.entities.Filme;
import model.entities.Livro;
import model.entities.Locadora;
import model.entities.Serie;
import model.exception.DomainException;

import java.util.List;

public class LocadoraService {

    private List<Locadora> itensLocadora;

    public LocadoraService(List<Locadora> itensLocadora) {
        this.itensLocadora = itensLocadora;
    }

    public void validarId(Integer Id) {
        for (Locadora item : itensLocadora) {
            if (item.getId().equals(Id)) {
                throw new DomainException("ID já existente. Tente novamente");
            }
        }
    }

    public Locadora criarItem(String tipo, Integer id, String nome, String genero, Double valor) {

        validarId(id);

        if (tipo.equalsIgnoreCase("Livro")) {
            return new Livro(id, nome, genero, valor);
        }
        else if (tipo.equalsIgnoreCase("Serie")) {
            return new Serie(id, nome, genero, valor);
        }
        else if (tipo.equalsIgnoreCase("Filme")) {
            return new Filme(id, nome, genero, valor);
        }
        else {
            throw new DomainException("Tipo inválido, Escolhe dentre as opções a seguir: Livro, Serie, Filme.");
        }
    }
}
