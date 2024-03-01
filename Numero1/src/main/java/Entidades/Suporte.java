package Entidades;

public class Suporte extends Funcionario{
    public Suporte(Integer id, String nome, Double salario) {
        super(id, nome, salario);
    }
    @Override
    public Double calcularSalario() {
        Double salario = this.getSalario();
        return salario + (salario * 0.5) + 1000;
    }
}
