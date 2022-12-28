package br.com.dio.desafio.dominio;
/*todo bootcamp vai ter conteudo, mentoria e cursos sao conteudos*/
public abstract class Conteudo {
    /*abstract significa que nao consegue criar/instanciar conteudo, nao da pra criar o metodo*/
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
