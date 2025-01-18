package vinicius.joao.model.interfaces;

public interface ArtilheiroDAO {
    String getNomeJogador();
    void setNomeJogador(String nomeJogador);

    int getGols();
    void setGols(int gols);

    int getJogos();
    void setJogos(int jogos);
}