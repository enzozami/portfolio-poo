import java.util.ArrayList;
import java.util.List;

public class ApresentacaoAvaliacao {
    private int id;
    private boolean foiApresentado;
    private double nota;
    private List<Avaliador> avaliadores;
    private TrabalhoPesquisa trabalhoPesquisa;

    public ApresentacaoAvaliacao(int id, boolean foiApresentado, double nota, TrabalhoPesquisa trabalhoPesquisa) {
        this.id = id;
        this.foiApresentado = foiApresentado;
        this.nota = nota;
        this.trabalhoPesquisa = trabalhoPesquisa;
        this.avaliadores = new ArrayList<>();
    }

    public void setFoiApresentado(boolean foiApresentado) {
        this.foiApresentado = foiApresentado;
    }

    public boolean getFoiApresentado() {
        return foiApresentado;
    }

    public TrabalhoPesquisa getTrabalhoPesquisa() {
        return trabalhoPesquisa;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setAvaliadores(Avaliador avaliador){
        this.avaliadores.add(avaliador);
    }

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
        dados.append(montarTexto("Foi Apresentado:", foiApresentado ? "Sim" : "Não"));
        dados.append(montarTexto("Nota: ", String.valueOf(nota)));

        return dados.toString();
    }

    private String montarTexto(String titulo, String descricao) {
        return titulo + descricao + "\n";
    }
}
