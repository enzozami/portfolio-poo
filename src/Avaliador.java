public class Avaliador extends Pessoa{
    private int matricula;
    private String tituloAcademico;

    public Avaliador(int id, String nome, int matricula, String tituloAcademico) {
        super(id, nome);
        this.matricula = matricula;
        this.tituloAcademico = tituloAcademico;
    }
}
