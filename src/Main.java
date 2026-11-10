import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Escrever o sistema aqui...



        // 1. CABEÇALHO DO SISTEMA
        System.out.println("==================================================");
        System.out.println("FACULDADE: Centro Universitário Alfredo Nasser");
        System.out.println("ALUNO: Marco Antônio Ferreira Santos");
        System.out.println("PROFESSOR: Brenno Pimenta");
        System.out.println("DISCIPLINA: Algoritmos e Linguagem de Programação II");
        System.out.println("==================================================\n");

        // 2. CRIANDO A LISTA DE QUESTÕES (COLLECTIONS)
        List<Questao> listaQuestoes = new ArrayList<>();

        // Questão 1
        Questao q1 = new Questao();
        q1.pergunta = "1. Qual plataforma é focada primariamente na publicação de vídeos curtos na vertical com rolagem infinita e conteúdos virais com dancinhas e áudios populares?";
        q1.opcaoA = "A) YouTube";
        q1.opcaoB = "B) TikTok";
        q1.opcaoC = "C) Vimeo";
        q1.opcaoD = "D) Twitch";
        q1.opcaoE = "E) Kwai";
        q1.correta = "B";
        listaQuestoes.add(q1);

        // Questão 2
        Questao q2 = new Questao();
        q2.pergunta = "2. Qual aplicativo de mensagens é famoso por utilizar o número de telefone do usuário como conta principal e é o mais utilizado no Brasil para conversas do dia a dia e grupos da família?";
        q2.opcaoA = "A) Telegram";
        q2.opcaoB = "B) Signal";
        q2.opcaoC = "C) Discord";
        q2.opcaoD = "D) Messenger";
        q2.opcaoE = "E) WhatsApp";
        q2.correta = "E";
        listaQuestoes.add(q2);

        // Questão 3
        Questao q3 = new Questao();
        q3.pergunta = "3. Qual aplicativo de streaming de música se destaca por permitir que o usuário alterne com um toque entre o áudio da música e o clipe oficial em vídeo, além de incluir no seu catálogo remixes, shows ao vivo e faixas raras do YouTube?";
        q3.opcaoA = "A) Youtube Music";
        q3.opcaoB = "B) Spotify";
        q3.opcaoC = "C) Deezer";
        q3.opcaoD = "D) Apple Music";
        q3.opcaoE = "E) Amazon Music";
        q3.correta = "A";
        listaQuestoes.add(q3);

        // Questão 4
        Questao q4 = new Questao();
        q4.pergunta = "4. Qual aplicativo de navegação por GPS é voltado prioritariamente para motoristas (carros e motos) e se destaca pelos alertas comunitários em tempo real sobre blitz, acidentes, radares e congestionamentos?";
        q4.opcaoA = "A) Google Maps";
        q4.opcaoB = "B) Waze";
        q4.opcaoC = "C) Apple Maps";
        q4.opcaoD = "D) Uber";
        q4.opcaoE = "E) Strava";
        q4.correta = "B";
        listaQuestoes.add(q4);

        // Questão 5
        Questao q5 = new Questao();
        q5.pergunta = "5. Qual aplicativo de mensagens é conhecido por permitir canais com número ilimitado de inscritos, envio de arquivos gigantescos e pelo ícone de um avião de papel azul?";
        q5.opcaoA = "A) Telegram";
        q5.opcaoB = "B) WhatsApp";
        q5.opcaoC = "C) Discord";
        q5.opcaoD = "D) Skype";
        q5.opcaoE = "E) Viber";
        q5.correta = "A";
        listaQuestoes.add(q5);

        // Questão 6
        Questao q6 = new Questao();
        q6.pergunta = "6. Qual aplicativo de comunicação é focado em comunidades, organizado em servidores com canais de voz permanentes e texto?";
        q6.opcaoA = "A) Telegram";
        q6.opcaoB = "B) WhatsApp";
        q6.opcaoC = "C) Discord";
        q6.opcaoD = "D) Messenger";
        q6.opcaoE = "E) Zoom";
        q6.correta = "C";
        listaQuestoes.add(q6);

        // Questão 7
        Questao q7 = new Questao();
        q7.pergunta = "7. Qual serviço de streaming de filmes e séries é conhecido pelo seu som característico \"Tudum\" ao abrir o app e por produções originais como Stranger Things?";
        q7.opcaoA = "A) Amazon Prime Video";
        q7.opcaoB = "B) HBO Max / Max";
        q7.opcaoC = "C) Disney+";
        q7.opcaoD = "D) Netflix";
        q7.opcaoE = "E) Globoplay";
        q7.correta = "D";
        listaQuestoes.add(q7);

        // Questão 8
        Questao q8 = new Questao();
        q8.pergunta = "8. Qual aplicativo de mapas e localização é voltado para o uso geral, oferecendo rotas para pedestres, transporte público, bicicletas e carros, além de permitir explorar locais comerciais e ver fotos de satélite?";
        q8.opcaoA = "A) Waze";
        q8.opcaoB = "B) Moovit";
        q8.opcaoC = "C) Garmin";
        q8.opcaoD = "D) Google maps";
        q8.opcaoE = "E) Uber";
        q8.correta = "D";
        listaQuestoes.add(q8);

        // Questão 9
        Questao q9 = new Questao();
        q9.pergunta = "9. Qual aplicativo tem o foco em músicas, podcasts e áudio, além da famosa \"Retrospectiva / Wrapped\" de fim de ano e playlists personalizadas por algoritmo?";
        q9.opcaoA = "A) Deezer";
        q9.opcaoB = "B) YouTube Music";
        q9.opcaoC = "C) Spotify";
        q9.opcaoD = "D) Apple Music";
        q9.opcaoE = "E) Amazon Music";
        q9.correta = "C";
        listaQuestoes.add(q9);

        // Questão 10
        Questao q10 = new Questao();
        q10.pergunta = "10. Qual rede social foca primariamente no compartilhamento de fotos e vídeos, ficou famosa pelos seus filtros de imagem e introduziu o recurso de \"Stories\"?";
        q10.opcaoA = "A) X";
        q10.opcaoB = "B) Instagram";
        q10.opcaoC = "C) TikTok";
        q10.opcaoD = "D) Kwai";
        q10.opcaoE = "E) Facebook";
        q10.correta = "B";
        listaQuestoes.add(q10);

        // Questão 11
        Questao q11 = new Questao();
        q11.pergunta = "11. Qual rede social funciona como um catálogo visual de ideias, onde os usuários criam pastas personalizadas e salvam \"pins\" com inspirações de decoração, moda, receitas e projetos?";
        q11.opcaoA = "A) Instagram";
        q11.opcaoB = "B) Tumblr";
        q11.opcaoC = "C) TikTok";
        q11.opcaoD = "D) Canva";
        q11.opcaoE = "E) Pinterest";
        q11.correta = "E";
        listaQuestoes.add(q11);

        // Questão 12
        Questao q12 = new Questao();
        q12.pergunta = "12. Qual serviço de streaming de vídeo é especializado em animes, simulcasts com lançamentos no mesmo dia do Japão?";
        q12.opcaoA = "A) Netflix";
        q12.opcaoB = "B) Disney+";
        q12.opcaoC = "C) Crunchyroll";
        q12.opcaoD = "D) HBO Max / Max";
        q12.opcaoE = "E) Amazon Prime Video";
        q12.correta = "C";
        listaQuestoes.add(q12);

        // Questão 13
        Questao q13 = new Questao();
        q13.pergunta = "13. Qual aplicativo e plataforma online é amplamente utilizado para criar designs gráficos, apresentações, cartões e posts para redes sociais a partir de modelos (templates) prontos e editáveis?";
        q13.opcaoA = "A) Picsart";
        q13.opcaoB = "B) Canva";
        q13.opcaoC = "C) Krita";
        q13.opcaoD = "D) Pinterest";
        q13.opcaoE = "E) Photoshop";
        q13.correta = "B";
        listaQuestoes.add(q13);

        // Questão 14
        Questao q14 = new Questao();
        q14.pergunta = "14. Qual aplicativo é amplamente utilizado no celular e computador para a edição de vídeos curtos, oferecendo ferramentas de corte, transições, efeitos visuais e a criação de legendas automáticas para redes sociais?";
        q14.opcaoA = "A) Picsart";
        q14.opcaoB = "B) Canva";
        q14.opcaoC = "C) CapCut";
        q14.opcaoD = "D) Alight Motion";
        q14.opcaoE = "E) Photoshop";
        q14.correta = "C";
        listaQuestoes.add(q14);

        // Questão 15
        Questao q15 = new Questao();
        q15.pergunta = "15. Qual plataforma e aplicativo é amplamente reconhecido como a principal referência global em transmissões ao vivo (lives) focadas em games e eSports, famosa por seu chat interativo com emotes exclusivos e sistema de inscrições (subs)?";
        q15.opcaoA = "A) YouTube";
        q15.opcaoB = "B) NimoTv";
        q15.opcaoC = "C) Kick";
        q15.opcaoD = "D) TikTok";
        q15.opcaoE = "E) Twitch";
        q15.correta = "E";
        listaQuestoes.add(q15);

        // 3. EXECUÇÃO DO QUIZ
        int acertos = 0;
        int total = listaQuestoes.size();

        for (int i = 0; i < total; i++) {
            Questao q = listaQuestoes.get(i);
            q.escrevaQuestao();
            String resposta = q.leiaResposta();

            if (q.isCorreta(resposta)) {
                acertos++;
            }
        }

        // 4. CÁLCULO E EXIBIÇÃO DO RESULTADO FINAL
        double porcentagem = ((double) acertos / total) * 100;

        System.out.println("==================================================");
        System.out.println("                 RESULTADO FINAL                  ");
        System.out.println("==================================================");
        System.out.println("Total de questões: " + total);
        System.out.println("Quantidade de acertos: " + acertos);
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
        System.out.println("==================================================");
        System.out.println("\nMuito obrigado por participar do Quiz!");
    }
}



