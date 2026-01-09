package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String nome;
    private List<Card> mao;
    private int pontos;

    public Player(String name) {
        this.nome = name;
        this.mao = new ArrayList<>();
        this.pontos = 0;
    }

    public void addCard(Card carta) {
        mao.add(carta);
        pontos += carta.getValor();
    }

    public int getPontos() {
        return pontos;
    }

    public List<Card> getMao() {
        return mao;
    }

    public String getNome() {
        return nome;
    }

    public void resetMao() {
        mao.clear();
        pontos = 0;
    }

    @Override
    public String toString() {
        return nome + " tem as cartas: " + mao + " (Total: " + pontos + ")";
    }
}

