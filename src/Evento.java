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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }
    public Pessoa getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(Pessoa coordenador) {
        this.coordenador = coordenador;
    }
    public List<ApresentacaoAvaliacao> getApresentacoes() {
        return apresentacoes;
    }

    /**
     * Confirma a apresentação de uma apresentação.
     *
     * @param apresentacao apresentação a confirmar
     */
    public void confirmarApresentacao(ApresentacaoAvaliacao apresentacao){
        apresentacao.setFoiApresentado(true);
    }

    /**
     * Inclui uma apresentação na programação do evento.
     *
     * @param apresentacao apresentação a adicionar
     */
    public void adicionarApresentacao(ApresentacaoAvaliacao apresentacao) {
        apresentacoes.add(apresentacao);
    }

    /**
     * Registra a nota de uma apresentação. A nota só é aceita se a
     * apresentação já foi confirmada e se estiver entre 0 e 10.
     *
     * @param apresentacao apresentação avaliada
     * @param nota         nota de 0 a 10
     * @return mensagem informando se a nota foi atribuída ou o motivo da recusa
     */
    public String atribuirNota(ApresentacaoAvaliacao apresentacao, double nota){
        if(!apresentacao.isFoiApresentado()){
            return "Não é possível atribuir nota: '" + apresentacao.getTrabalho().getTitulo()
                    + "' não foi apresentado.";
        }
        if(nota < 0 || nota > 10){
            return "Nota inválida. A nota deve estar entre 0 e 10.";
        }
        apresentacao.setNota(nota);
        return "Nota atribuída com sucesso.";
    }

    /**
     * Retorna os dados do evento e, para cada apresentação, o título do trabalho,
     * presença, nota, alunos da equipe e avaliadores. Ao final, mostra o coordenador.
     *
     * @return texto com os dados completos do evento
     */
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
