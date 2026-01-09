package BlackJack;

public enum Suit {
    COPAS("Copas"), OUROS("Ouros"), ESPADAS("Espadas"), PAUS("Paus");

    private final String Naipe;

    Suit(String naipe) {
        this.Naipe = naipe;
    }

    public String getNaipe() {
        return Naipe;
    }
}
