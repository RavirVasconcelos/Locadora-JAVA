package application;

import model.entities.Locadora;
import model.exception.DomainException;
import model.services.LocadoraService;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Locadora> itensLocadora = new ArrayList<>();
        LocadoraService service = new LocadoraService(itensLocadora);

        while(true) {

            try {
                System.out.println("--------- BEM-VINDO A LOCADORA ---------");
                System.out.println("Tem algumas opções, escolha um tipo: Livro, Serie, Filme.");
                System.out.println("Caso não queira continuar, pode digitar 'sair' e muito obrigado!");

                String tipo = sc.nextLine();

                if (tipo.equalsIgnoreCase("sair")) {
                    break;
                }

                System.out.print("Informe quantos deseja adicionar: ");
                int qtd = sc.nextInt();
                sc.nextLine();

                for (int i = 1; i <= qtd; i++) {

                    System.out.println();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Gênero: ");
                    String genero = sc.nextLine();
                    System.out.print("Preço: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    Locadora novoItem = service.criarItem(tipo, id, nome, genero, valor);
                    itensLocadora.add(novoItem);
                    System.out.println("Adicionado com sucesso!");
                    System.out.println();
                }
            }
            catch (DomainException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            catch (InputMismatchException e ) {
                System.out.println("Erro: Entrada inválida. Por favor tente novamente");
                sc.nextLine();
            }
            catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        System.out.println("Produtos:");
        for (Locadora item : itensLocadora) {
            System.out.println(item);
        }
    }
}