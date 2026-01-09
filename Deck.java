package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cartas;

    public Deck() {
        this.cartas = new ArrayList<>();
        for (Suit naipes : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cartas.add(new Card(naipes, rank));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cartas);
    }

    public Card dealCard() {// Remove a carta do top do baralho
        return cartas.remove(0);
    }

    public int cartasLeft() {
        return cartas.size();
    }
}

