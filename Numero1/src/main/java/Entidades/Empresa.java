package Entidades;

import java.util.ArrayList;

interface IEmpresa {
    public Double calcularFolhaSalarial();
}
public class Empresa implements IEmpresa {
    private ArrayList<Funcionario> _funcionarios;

    public Empresa(ArrayList<Funcionario> funcionarios){
        this._funcionarios = funcionarios;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return _funcionarios;
    }
    public void setFuncionarios(ArrayList<Funcionario> _funcionarios) {
        this._funcionarios = _funcionarios;
    }

    @Override
    public Double calcularFolhaSalarial() {
        double valorFolhaSalarial = 0.0;
        for (Funcionario funcionario : this._funcionarios) {
            valorFolhaSalarial += funcionario.calcularSalario();
        }
        return valorFolhaSalarial;
    }
}
