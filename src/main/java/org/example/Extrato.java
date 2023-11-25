package org.example;

public class Extrato implements Cloneable {
    private Integer entrada;

    private Integer saida;

    public Extrato(Integer entrada, Integer saida) {
        super();
        this.entrada = entrada;
        this.saida = saida;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public Extrato setEntrada(Integer entrada) {
        this.entrada = entrada;
        return this;
    }

    public Integer getSaida() {
        return saida;
    }

    public Extrato setSaida(Integer saida) {
        this.saida = saida;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Extrato{" +
                "entrada = '" + entrada + '\'' +
                ", saida =" + saida +
                '}';
    }

}