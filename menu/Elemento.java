package menu;

import status.Estado;

import java.util.ArrayList;

public class Elemento {

    private String nome;
    private Estado status;

    private ArrayList<Elemento> elementos = new ArrayList<>();

    public Elemento(String nome, Estado status) {
        this.nome = nome;
        this.status = status;
    }

    public Elemento(String nome, Estado status, ArrayList<Elemento> elementos) {
        this.nome = nome;
        this.status = status;
        this.elementos = elementos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getStatus() {
        return status;
    }

    public void setStatus(Estado status) {
        this.status = status;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }
}
