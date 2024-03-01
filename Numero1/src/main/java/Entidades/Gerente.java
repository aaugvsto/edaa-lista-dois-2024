package Entidades;

public class Gerente extends Funcionario {
    public Gerente(Integer id, String nome, Double salario) {
        super(id, nome, salario);
    }
    @Override
    public Double calcularSalario() {
        Double salario = this.getSalario();
        return salario + (salario * 0.20) + 1000;
    }
}
