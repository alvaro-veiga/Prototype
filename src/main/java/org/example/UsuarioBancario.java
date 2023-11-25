package org.example;

public class UsuarioBancario implements Cloneable {
    private int cpf;
    private String nome;
    private String endereco;
    private Extrato extrato;

    public UsuarioBancario(int cpf, String nome, String endereco, Extrato extrato) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.extrato = extrato;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Extrato getExtrato() {
        return extrato;
    }

    public void setExtrato(Extrato extrato) {
        this.extrato = extrato;
    }

    @Override
    public UsuarioBancario clone() throws CloneNotSupportedException {
        UsuarioBancario usuarioClone = (UsuarioBancario) super.clone();
        usuarioClone.extrato = (Extrato) usuarioClone.extrato.clone();
        return usuarioClone;
    }

    @Override
    public String toString() {
        return "Usuario Banco{" +
                "nome =" + nome +
                ", cpf ='" + cpf + '\'' +
                ", endereco='" + endereco+ '\'' +
                ", extrato =" + extrato + '\'' +
                '}';
    }

}