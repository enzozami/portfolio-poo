import java.util.ArrayList;
import java.util.List;

public class ApresentacaoAvaliacao {
    private int id;
    private boolean foiApresentado;
    private double nota;
    private List<Avaliador> avaliadores = new ArrayList<>();
    private TrabalhoPesquisa trabalhoPesquisa;

    public ApresentacaoAvaliacao(int id, TrabalhoPesquisa trabalho) {
        this.id = id;
        this.trabalhoPesquisa = trabalho;
        this.foiApresentado = false;
        this.nota = 0.0;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isFoiApresentado() {
        return foiApresentado;
    }
    public void setFoiApresentado(boolean foiApresentado) {
        this.foiApresentado = foiApresentado;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public TrabalhoPesquisa getTrabalho() {
        return trabalhoPesquisa;
    }
    public void setTrabalho(TrabalhoPesquisa trabalhoPesquisa) {
        this.trabalhoPesquisa = trabalhoPesquisa;
    }
    public List<Avaliador> getAvaliadores() {
        return avaliadores;
    }

    /**
     * Adiciona um avaliador à lista de avaliadores.
     *
     * @param avaliador avaliador a ser adicionado
     */
    public void setAvaliadores(Avaliador avaliador){
        this.avaliadores.add(avaliador);
    }

    /**
     * Retorna o título do trabalho, os membros da equipe, os avaliadores,
     * a presença e a nota da apresentação.
     *
     * @return texto com os dados da apresentação
     */
    public String mostraDados() {
        StringBuilder dados = new StringBuilder();

        dados.append(montarTexto("Título: ", trabalhoPesquisa.getTitulo()));
        dados.append("Equipe:\n");
        for (Aluno aluno : trabalhoPesquisa.getParticipantes()) {
            dados.append("-> ").append(aluno.mostraDados());
            dados.append("\n");
        }
        dados.append("Avaliadores:\n");
        for (Avaliador avaliador : avaliadores) {
            dados.append("-> ").append(avaliador.mostraDados());
            dados.append("\n");
        }
        dados.append(montarTexto("Foi Apresentado: ", foiApresentado ? "Sim" : "Não"));
        dados.append(montarTexto("Nota: ", String.valueOf(nota)));

        return dados.toString();
    }

    private String montarTexto(String titulo, String descricao) {
        return titulo + descricao + "\n";
    }
}
