public class TesteControle {
    public static void main(String[] args) {
        // Pessoas / Coordenadores
        Pessoa coord1 = new Pessoa(1, "Prof. Ricardo Lima");
        Pessoa coord2 = new Pessoa(2, "Profa. Marta Souza");

        // Alunos
        Aluno a1 = new Aluno(10, "Enzo Silva", 1001, "Análise e Desenvolvimento de Sistemas");
        Aluno a2 = new Aluno(11, "Ana Costa", 1002, "Análise e Desenvolvimento de Sistemas");
        Aluno a3 = new Aluno(12, "Bruno Alves", 1003, "Engenharia de Software");
        Aluno a4 = new Aluno(13, "Carla Dias", 1004, "Engenharia de Software");
        Aluno a5 = new Aluno(14, "Diego Rocha", 1005, "Ciência da Computação");
        Aluno a6 = new Aluno(15, "Fernanda Melo", 1006, "Ciência da Computação");

        // Avaliadores
        Avaliador av1 = new Avaliador(20, "Dr. Paulo Mendes", 5001, "Doutor");
        Avaliador av2 = new Avaliador(21, "Dra. Helena Rios", 5002, "Doutora");
        Avaliador av3 = new Avaliador(22, "Me. Jorge Pinto", 5003, "Mestre");
        Avaliador av4 = new Avaliador(23, "Dra. Lúcia Prado", 5004, "Doutora");

        // Trabalhos de pesquisa
        TrabalhoPesquisa t1 = new TrabalhoPesquisa(100, "Aplicativo Mobile com Flutter",
                "Desenvolvimento de um app multiplataforma para gestão de pedidos.");
        t1.setParticipantes(a1);
        t1.setParticipantes(a2);

        TrabalhoPesquisa t2 = new TrabalhoPesquisa(101, "Inteligência Artificial na Educação",
                "Estudo sobre o uso de IA para personalizar o aprendizado.");
        t2.setParticipantes(a3);
        t2.setParticipantes(a4);

        TrabalhoPesquisa t3 = new TrabalhoPesquisa(102, "Segurança em APIs REST",
                "Análise de boas práticas de autenticação e autorização.");
        t3.setParticipantes(a5);
        t3.setParticipantes(a6);

        // Apresentações / Avaliações
        ApresentacaoAvaliacao ap1 = new ApresentacaoAvaliacao(200, t1);
        ap1.setAvaliadores(av1);
        ap1.setAvaliadores(av2);

        ApresentacaoAvaliacao ap2 = new ApresentacaoAvaliacao(201, t2);
        ap2.setAvaliadores(av2);
        ap2.setAvaliadores(av3);

        ApresentacaoAvaliacao ap3 = new ApresentacaoAvaliacao(202, t3);
        ap3.setAvaliadores(av3);
        ap3.setAvaliadores(av4);

        // Eventos
        Evento ev1 = new Evento(300, "Congresso", "Congresso de Tecnologia 2026",
                "20/11/2026", "Campus Central", "Sala 101", coord1);
        Evento ev2 = new Evento(301, "Seminário", "Seminário de Pesquisa Aplicada",
                "05/12/2026", "Campus Norte", "Sala 202", coord2);

        ev1.adicionarApresentacao(ap1);
        ev1.adicionarApresentacao(ap2);
        ev2.adicionarApresentacao(ap3);

        // Confirmações e notas
        ev1.confirmarApresentacao(ap1);
        System.out.println(ev1.atribuirNota(ap1, 9.5));
        System.out.println(ev1.atribuirNota(ap2, 8.0));
        ev1.confirmarApresentacao(ap2);
        System.out.println(ev1.atribuirNota(ap2, 8.0));
        ev2.confirmarApresentacao(ap3);
        System.out.println(ev2.atribuirNota(ap3, 7.5));

        // mostraDados: TrabalhoPesquisa
        System.out.println("\n##### mostraDados - TrabalhoPesquisa #####");
        System.out.println(t1.mostraDados());
        System.out.println(t2.mostraDados());

        // mostraDados: ApresentacaoAvaliacao
        System.out.println("##### mostraDados - ApresentacaoAvaliacao #####");
        System.out.println(ap1.mostraDados());
        System.out.println(ap2.mostraDados());

        // mostraDados: Evento
        System.out.println("##### mostraDados - Evento #####");
        System.out.println(ev1.mostraDados());
        System.out.println(ev2.mostraDados());
    }
}
