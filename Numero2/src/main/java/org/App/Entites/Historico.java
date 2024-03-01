package org.App.Entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class Historico {
    private UUID _id;
    private String _dataRegistro;

    public Historico(){
        this._id = UUID.randomUUID();
        this._dataRegistro = formatarData(new Date());
    }

    public UUID getId() {
        return _id;
    }

    public String getDataRegistro() {
        return _dataRegistro;
    }

    public void getDataRegistro(Date _dataLigacao) {
        this._dataRegistro = formatarData(_dataLigacao);
    }

    private String formatarData(Date data){
        return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(data);
    }
}
