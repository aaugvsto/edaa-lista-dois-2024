import Entidades.*;
import Enums.Cargo;

import java.util.ArrayList;

import static Enums.Cargo.*;

public class App {

    public static Funcionario lerDadosFuncionario(int id, String nome, double salarioBase, Cargo cargo){
        return switch (cargo) {
            case DESENVOLVEDOR -> new Desenvolvedor(id, nome, salarioBase);
            case GERENTE -> new Gerente(id, nome, salarioBase);
            case SUPORTE -> new Suporte(id, nome, salarioBase);
        };
    }

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(lerDadosFuncionario(10, "Augusto", 5000.00, DESENVOLVEDOR));
        funcionarios.add(lerDadosFuncionario(10, "João", 5000.00, DESENVOLVEDOR));
        funcionarios.add(lerDadosFuncionario(10, "Felipe", 5000.00, GERENTE));
        funcionarios.add(lerDadosFuncionario(10, "Emerson", 5000.00, SUPORTE));
        funcionarios.add(lerDadosFuncionario(10, "Tiago", 5000.00, DESENVOLVEDOR));

        Empresa empresa = new Empresa(funcionarios);

        System.out.println("Valor da folha salarial da empresa: " + empresa.calcularFolhaSalarial());
    }
}