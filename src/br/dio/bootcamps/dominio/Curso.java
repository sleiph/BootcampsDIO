package br.dio.bootcamps.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format(
                "Curso{título='%s', descricao='%s', carga_horária='%s'}", getTitulo(), getDescricao(), cargaHoraria
        );
    }
}
