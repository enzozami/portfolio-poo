public class Aluno extends Pessoa{
    private int ra;
    private String curso;

    public Aluno(int id, String nome, int ra, String curso) {
        super(id, nome);
        this.ra = ra;
        this.curso = curso;
    }

    public int getRa() { return ra; }
    public void setRa(int ra) { this.ra = ra; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    /**
     * Retorna os dados de Pessoa acrescidos do RA e do curso do aluno.
     *
     * @return texto com id, nome, RA e curso
     */
    @Override
    public String mostraDados() {
        return super.mostraDados() + " | RA: " + ra + " | Curso: " + curso;
    }
}