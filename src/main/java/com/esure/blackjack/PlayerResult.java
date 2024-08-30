package com.esure.blackjack;

/**
 * Describes the outcome of the game for a single player, including:
 * - `win`: indicates whether the player's score was higher than the dealer's or not
 * - `description`: player name, score and list of cards in hand
 */
public class PlayerResult {

    private boolean win;
    private String description;

    public PlayerResult(boolean win, String description) {
        this.win = win;
        this.description = description;
    }

     public boolean isWin() {
        return win;
    }

    public String getDescription() {
        return description;
    }
}