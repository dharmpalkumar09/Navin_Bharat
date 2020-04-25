package com.navinbharat.mediator.domain;

import java.sql.Blob;

public class Idproof {
    private Idtype idType;
    private String idnumber;
    private Blob idDoc;

    @Override
    public String toString() {
        return "Idproof{" +
                "idType=" + idType +
                ", idnumber='" + idnumber + '\'' +
                ", idDoc=" + idDoc +
                '}';
    }

    public Idtype getIdType() {
        return idType;
    }

    public void setIdType(Idtype idType) {
        this.idType = idType;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public Blob getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Blob idDoc) {
        this.idDoc = idDoc;
    }
}
