Este projeto implementa um jogo de BlackJack em Java, desenvolvido como atividade da Faculdade, para cadeira POO. A aplicação foi estruturada seguindo princípios de encapsulamento, abstração e separação de responsabilidades.

Estrutura dos arquivos:

* Game(Classe) - Controla o fluxo principal do jogo, incluindo as regras, turnos e condições de vitória ou derrota.

* Player(Classe) - Representa o jogador, armazenando informações como a mão de cartas e ações possíveis durante o jogo.

* Deck(Classe) - Responsável pela criação, embaralhamento e distribuição das cartas.

* Card(Classe) - Modela uma carta do baralho, associando um Rank (valor) a um Suit (naipe).

* Rank(Interface) - Define os valores possíveis das cartas (ex: Ás, Dois, Três, etc.), permitindo flexibilidade e melhor organização dos valores no jogo.

* Suit(Interface) - Define os naipes do baralho (ex: Copas, Espadas, Ouros e Paus).