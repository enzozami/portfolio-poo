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

    public Evento(int id, String tipo, String nome, String data, String local, String sala) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.sala = sala;
        this.apresentacoes = new ArrayList<>();
    }

    public void confirmarApresentacao(){
        // Lógica para confirmar a apresentação
    }

    public String atribuirNota(){
        // Lógica para atribuir nota
        return "Nota atribuída com sucesso!";
    }

    public String mostraDados(){
        return "";
    }
}
