package model;

public class Aviao {
    private String modelo;
    private int id;

    public Aviao(String modelo, int id) {
        this.modelo = modelo;
        this.id = id;
    }
    public Aviao() {}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
