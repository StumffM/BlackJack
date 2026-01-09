package BlackJack;

import java.util.Scanner;

public class Game {
    private Deck deck;
    private Player dealer;
    private Player player;

    public Game() {
        this.deck = new Deck();
        this.dealer = new Player("Dealer");
        this.player = new Player("Jogador");
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Blackjack!");

        while(true) {
            player.resetMao();
            dealer.resetMao();

            dealer.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());

            System.out.println(player);
            System.out.println("Dealer mostra: " + dealer.getMao().get(0));

            while (true) {
                System.out.println("Seu Turno");
                System.out.println("Escolha uma opção: HIT ou STAND (H/S)");
                String select = scanner.next().toUpperCase();

                if (select.equals("H")) {
                    player.addCard(deck.dealCard());
                    System.out.println(player);

                    if (player.getPontos() > 21) {
                        System.out.println("Player Perdeu(Excesso de de Pontos");
                        break;
                    }
                    break;
                } else if (select.equals("S"))
                    break;
            }
                if (player.getPontos() <= 21) {
                    System.out.println("Turno do Dealer");

                    dealer.addCard(deck.dealCard());
                    System.out.println(dealer);

                    if (dealer.getPontos() == 21)
                        System.out.println("Dealer venceu!");

                    if (dealer.getPontos() > 21 || player.getPontos() == 21) {
                        System.out.println("Você venceu!");
                    } else if (player.getPontos() == dealer.getPontos())
                        System.out.println("Empate!");
                }
                System.out.println("Deseja jogar novamente? (S/N)");
                String select1 = scanner.next().toUpperCase();
                if (!select1.equals("S"))
                    break;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }

}

