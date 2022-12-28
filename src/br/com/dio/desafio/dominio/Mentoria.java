package br.com.dio.desafio.dominio;

public class Mentoria extends Conteudo {

    private java.util.Date data;
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public java.util.Date getData() {
        return data;
    }

    public void setData(java.util.Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +                ", data=" + data +
                '}';
    }
}
