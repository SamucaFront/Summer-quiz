public class Quiz {
    public static void main(String[] args) {
        System.out.println("Faculdade Unifan");
        System.out.println("Aluno: Samuel Reges Costa");
        System.out.println("Professor: Brenno");
        System.out.println("\nBem-vindo ao Quiz sobre o filme (500) Dias com Ela!");
        System.out.println("Responda 15 perguntas de múltipla escolha e teste seus conhecimentos.\n");

        Questao[] questoes = new Questao[15];

        questoes[0] = criarQuestao("Qual é o trabalho de Tom Hansen no início do filme?",
                "[A] Arquiteto", "[B] Designer Gráfico", "[C] Escritor de cartões comemorativos", "[D] Publicitário", "[E] Engenheiro Civil", "C");

        questoes[1] = criarQuestao("Em que local Tom e Summer se conhecem pela primeira vez?",
                "[A] No elevador", "[B] No trabalho", "[C] Em uma livraria", "[D] Em um café", "[E] No parque", "B");

        questoes[2] = criarQuestao("Qual é a música que Summer canta no karaokê?",
                "[A] Sugar Town", "[B] Here Comes Your Man", "[C] There Is a Light That Never Goes Out", "[D] Sweet Disposition", "[E] She's Got You High", "A");

        questoes[3] = criarQuestao("O que Summer diz que não acredita no começo do filme?",
                "[A] Em amor verdadeiro", "[B] Em relacionamentos", "[C] Em finais felizes", "[D] Em amizade", "[E] Em alma gêmea", "A");

        questoes[4] = criarQuestao("Qual é o apelido que Summer recebe de seus colegas de trabalho?",
                "[A] A misteriosa", "[B] A romântica", "[C] A destruidora de corações", "[D] A divertida", "[E] A sonhadora", "C");

        questoes[5] = criarQuestao("Qual é a cidade natal de Summer?",
                "[A] Los Angeles", "[B] Chicago", "[C] Nova York", "[D] San Francisco", "[E] Michigan", "E");

        questoes[6] = criarQuestao("Qual é o nome do amigo de Tom que aparece frequentemente no filme?",
                "[A] Paul", "[B] Ethan", "[C] Harry", "[D] Charlie", "[E] Lucas", "A");

        questoes[7] = criarQuestao("Qual é o hobby que Tom deseja seguir como carreira?",
                "[A] Pintura", "[B] Arquitetura", "[C] Música", "[D] Escrita", "[E] Fotografia", "B");

        questoes[8] = criarQuestao("Qual música Tom e Summer discutem no elevador?",
                "[A] Sweet Disposition", "[B] Here Comes Your Man", "[C] There Is a Light That Never Goes Out", "[D] You Make My Dreams", "[E] Sugar Town", "C");

        questoes[9] = criarQuestao("Quantos dias do relacionamento de Tom e Summer são mostrados no filme?",
                "[A] 365", "[B] 400", "[C] 500", "[D] 600", "[E] 700", "C");

        questoes[10] = criarQuestao("Qual é o presente que Tom recebe de Summer no aniversário dele?",
                "[A] Um LP dos Smiths", "[B] Um livro de arquitetura", "[C] Um desenho feito por ela", "[D] Uma jaqueta", "[E] Um par de óculos de sol", "B");

        questoes[11] = criarQuestao("Qual lugar Tom leva Summer para mostrar sua cidade?",
                "[A] Uma cafeteria", "[B] Uma livraria", "[C] Um banco no parque", "[D] Uma ponte", "[E] Um museu", "C");

        questoes[12] = criarQuestao("O que Tom descobre sobre Summer no final do filme?",
                "[A] Ela se mudou para outra cidade", "[B] Ela escreveu um livro", "[C] Ela se casou com outro homem", "[D] Ela abriu um negócio", "[E] Ela desistiu do amor", "C");

        questoes[13] = criarQuestao("Qual é o nome da nova mulher que Tom conhece no final do filme?",
                "[A] Autumn", "[B] Spring", "[C] Winter", "[D] Summer 2", "[E] Anna", "A");

        questoes[14] = criarQuestao("Qual é a frase mais marcante dita por Tom sobre Summer?",
                "[A] 'Ela é perfeita.'", "[B] 'Ela não era a mulher da minha vida.'", "[C] 'Ela me ensinou a amar.'", "[D] 'Ela destruiu meus sonhos.'", "[E] 'Ela era apenas mais uma.'", "B");

        int acertos = 0;
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ":");
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(resposta)) {
                acertos++;
            }
        }

        int erros = questoes.length - acertos;
        double porcentagem = ((double) acertos / questoes.length) * 100;

        System.out.println("Fim do Quiz!");
        System.out.println("Você acertou: " + acertos);
        System.out.println("Você errou: " + erros);
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
    }

    public static Questao criarQuestao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String correta) {
        Questao q = new Questao();
        q.pergunta = pergunta;
        q.opcaoA = opcaoA;
        q.opcaoB = opcaoB;
        q.opcaoC = opcaoC;
        q.opcaoD = opcaoD;
        q.opcaoE = opcaoE;
        q.correta = correta;
        return q;
}
}