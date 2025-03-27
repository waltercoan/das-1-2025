package br.univille.ativchat.model;

public record Mensagem(String nome, String texto) {
    public Mensagem(String nome, String texto) {
        this.nome = nome;
        this.texto = texto;
    }
} 