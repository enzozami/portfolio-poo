public class Avaliador extends Pessoa{
    private int matricula;
    private String tituloAcademico;

    public Avaliador(int id, String nome, int matricula, String tituloAcademico) {
        super(id, nome);
        this.matricula = matricula;
        this.tituloAcademico = tituloAcademico;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getTituloAcademico() {
        return tituloAcademico;
    }
    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    /**
     * Retorna os dados de Pessoa acrescidos da matrícula e do título acadêmico.
     *
     * @return texto com id, nome, matrícula e título
     */
    @Override
    public String mostraDados() {
        return super.mostraDados() + " | Matrícula: " + matricula + " | Título: " + tituloAcademico;
    }
}
