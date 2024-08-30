package com.esure.blackjack;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BlackjackGameTest {

    private Deck deck;
    private BlackjackGame game;

    @BeforeEach
    void setUp() {
        final var cards = new ArrayList<Card>();
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                cards.add(new Card(r, s));
            }
        }
        deck = new Deck(cards);
        game = new BlackjackGame();
    }

    @Test
    void sortedDeck() {
        final var actual = game.play(4, deck);
        assertThat(actual[0].isWin()).isFalse();
        assertThat(actual[0].getDescription()).isEqualTo("name=player-0, score=18 ([2C, 3D, 4H, 4S, 5C])");
        assertThat(actual[1].isWin()).isFalse();
        assertThat(actual[1].getDescription()).isEqualTo("name=player-1, score=20 ([2D, 3H, 5D, 5H, 5S])");
        assertThat(actual[2].isWin()).isFalse();
        assertThat(actual[2].getDescription()).isEqualTo("name=player-2, score=17 ([2H, 3S, 6C, 6D])");
        assertThat(actual[3].isWin()).isFalse();
        assertThat(actual[3].getDescription()).isEqualTo("name=player-3, score=18 ([2S, 4C, 6H, 6S])");
    }
}
