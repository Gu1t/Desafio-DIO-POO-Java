package Desafio.Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    LocalDate data;
    
    @Override
    public double calcularxp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(){

    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public String toString(){
        return "Mentoria{" +
        "título='" + getTitulo() + '\'' +
        ", descrição='" + getDescricao() + '\'' +
        ", data=" + data +
        '}';
    }

}
