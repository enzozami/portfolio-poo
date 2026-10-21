import java.util.ArrayList;
import java.util.List;

public class Evento {
    private int id;
    private String tipo;
    private String nome;
    private String data;
    private String local;
    private String sala;
    private List<ApresentacaoAvaliacao> apresentacoes;
    private Pessoa coordenador;

    public Evento(int id, String tipo, String nome, String data, String local, String sala, Pessoa coordenador) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.sala = sala;
        this.coordenador = coordenador;
        this.apresentacoes = new ArrayList<>();
    }

    public void confirmarApresentacao(ApresentacaoAvaliacao apresentacao){
        apresentacao.setFoiApresentado(true);
    }

    public void adicionarApresentacao(ApresentacaoAvaliacao apresentacao) {
        apresentacoes.add(apresentacao);
    }

    public String atribuirNota(ApresentacaoAvaliacao apresentacao, double nota){
        if(!apresentacao.getFoiApresentado()){
            return "Não é possível atribuir nota: '" + apresentacao.getTrabalhoPesquisa().getTitulo()
                    + "' não foi apresentado.";
        }
        if(nota < 0 || nota > 10){
            return "Nota inválida. A nota deve estar entre 0 e 10.";
        }
        apresentacao.setNota(nota);
        return "Nota atribuída com sucesso.";
    }

    public String mostraDados(){
        StringBuilder dados = new StringBuilder();
        dados.append("ID: ").append(id).append("\n");
        dados.append("Tipo: ").append(tipo).append("\n");
        dados.append("Nome: ").append(nome).append("\n");
        dados.append("Data: ").append(data).append("\n");
        dados.append("Local: ").append(local).append("\n");
        dados.append("Sala: ").append(sala).append("\n");
        dados.append("Apresentações:\n");
        for (ApresentacaoAvaliacao apresentacao : apresentacoes) {
            dados.append(apresentacao.mostraDados()).append("\n");
        }
        dados.append("Coordenador: ").append(coordenador.mostraDados()).append("\n");
        return dados.toString();
    }
}
