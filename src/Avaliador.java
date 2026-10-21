public class Avaliador extends Pessoa{
    private int matricula;
    private String tituloAcademico;

    public Avaliador(int id, String nome, int matricula, String tituloAcademico) {
        super(id, nome);
        this.matricula = matricula;
        this.tituloAcademico = tituloAcademico;
    }

    public int getMatricula() { return matricula; }
    public String getTituloAcademico() { return tituloAcademico; }

    @Override
    public String mostraDados() {
        return getMatricula() + " - " + getTituloAcademico() + " " + getNome();
    }
}
