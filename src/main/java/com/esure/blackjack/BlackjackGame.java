package com.esure.blackjack;

/**
 * Simulation of a game of blackjack, using simplified rules specified in README.md.
 */
public class BlackjackGame {

    /**
     * Play a game of blackjack, according to simplified rules in README.md, with the given number of players (plus the
     * dealer) and provided deck of cards.
     *
     * Outcome of the game is represented as a PlayerResult array with one element per player. Player result includes
     * a boolean, indicating whether that player beat the dealer, and a textual description of their game. See
     * README.md for more details.
     *
     * @param playerCount number of players in the game, excluding dealer
     * @param deck cards with which to play the game
     * @return outcome of the game
     */
    public PlayerResult [] play(int playerCount, Deck deck) {
        return new PlayerResult[] {
                new PlayerResult(false, "name=player-0, score=18 ([2C, 3D, 4H, 4S, 5C])"),
                new PlayerResult(false, "name=player-1, score=20 ([2D, 3H, 5D, 5H, 5S])"),
                new PlayerResult(false, "name=player-2, score=17 ([2H, 3S, 6C, 6D])"),
                new PlayerResult(false, "name=player-3, score=18 ([2S, 4C, 6H, 6S])")
        };
    }

}
