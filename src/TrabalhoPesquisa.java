import java.util.ArrayList;
import java.util.List;

public class TrabalhoPesquisa {
    private int id;
    private String titulo;
    private String resumo;
    private List<Aluno> participantes;

    public TrabalhoPesquisa(int id, String titulo, String resumo){
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.participantes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public List<Aluno> getParticipantes() {
        return participantes;
    }

    /**
     * Inclui um aluno na equipe do trabalho.
     *
     * @param aluno aluno a ser adicionado
     */
    public void setParticipantes(Aluno aluno){
        this.participantes.add(aluno);
    }

    /**
     * Retorna o título, o resumo e os alunos que compõem a equipe.
     *
     * @return texto com os dados do trabalho
     */
    public String mostraDados() {
        StringBuilder dados = new StringBuilder();

        dados.append(montarTexto("Título: ", titulo));
        dados.append(montarTexto("Descrição: ", resumo));
        dados.append("Equipe:\n");

        for (Aluno aluno : participantes) {
            dados.append("-> ").append(aluno.mostraDados());
            dados.append("\n");
        }

        return dados.toString();
    }

    private String montarTexto(String titulo, String descricao) {
        return titulo + descricao + "\n";
    }
}
