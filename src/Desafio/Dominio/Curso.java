package Desafio.Dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;
    
    @Override
    public double calcularxp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){
    }

    public int getcargaHorario(){
        return cargaHoraria;
    }

    public void setCargahoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
        "titulo='" + getTitulo() + '\'' +
        ", descricao='" + getDescricao() + '\'' +
        ", cargaHoraria=" + cargaHoraria +
        '}';
    }
}

