package Entidades;
public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(Integer id, String nome, Double salario) {
        super(id, nome, salario);
    }

    @Override
    public Double calcularSalario() {
        Double salario = this.getSalario();
        return salario + (salario * 0.10) + 1000;
    }
}
