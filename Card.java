package BlackJack;

public class Card {
    private final Suit naipes;
    private final Rank cartas;

    Card(Suit n, Rank c) {
        this.naipes = n;
        this.cartas = c;
    }

    public Rank getCartas() {
        return cartas;
    }

    public Suit getNaipes() {
        return naipes;
    }

    public int getValor(){
        return cartas.getValor();
    }

    @Override
    public String toString() {
        return cartas.getNome() +" de "+ naipes.getNaipe();
    }

}
