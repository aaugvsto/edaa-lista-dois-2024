package Entidades;

interface IFuncionario {
    public Double calcularSalario();
}
public abstract class Funcionario implements IFuncionario {
    private Integer _id;
    private String _nome;
    private Double _salario;

    public Funcionario(Integer id, String nome, Double salario){
        this._id = id;
        this._nome = nome;
        this._salario = salario;
    }

    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public Double getSalario() {
        return _salario;
    }
    public void setSalario(Double _salario) {
        this._salario = _salario;
    }
}
