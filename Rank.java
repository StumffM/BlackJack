package BlackJack;

public enum Rank {
    DOIS(2,"2"), TRES(3,"3"), QUATRO(4,"4"),
    CINCO(5,"5"), SEIS(6,"6"), SETE(7,"7"),
    OITO(8,"8"), NOVE(9,"9"), DEZ(10,"10"),
    VALETE(10,"10"), RAINHA(10,"10"), REI(10,"10"), AS(11,"11");

    private final int valor;
    private final String nome;

    Rank(int i, String n) {
        this.valor = i;
        this.nome = n;
    }

    public int getValor(){
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
