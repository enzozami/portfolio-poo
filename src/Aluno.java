public class Aluno extends Pessoa{
    public int ra;
    public String curso;

    public Aluno(int id, String nome, int ra, String curso) {
        super(id, nome);
        this.ra = ra;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public String getCurso(){
        return curso;
    }

    public String mostraDados(){
        return getRa() + " - " + getNome() + " - " + getCurso();
    }
}