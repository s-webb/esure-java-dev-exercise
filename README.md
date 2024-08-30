Create a simulation of the card game blackjack. The rules of the game have been modified to make the outcome
deterministic - for a given sequence of cards in the deck, the game should always produce the same outcome.

# Game rules
- all games are played with 1 deck
- all games have a number of players and a dealer
- players are dealt an initial 2 cards
- dealer is dealt an initial 2 cards
- each player in turn "plays their hand" and attempts to make a hand of 21 or less
  - if the player's score is less than 17, they must take an extra card
  - if the player's score is 17 or greater, they must stick
  - player score of 21 - automatic stick and win
  - player score > 21 (bust) - automatic loss
- each individual card is scored as follows:
  - for ranks 2 to 10, score of the card is same as rank
  - Jack, Queen and King score 10
  - Ace scores 11 when score including ace is 21 or less, otherwise 1
- after all players have played their hand, the dealer plays their hand
  - dealer repeatedly takes an extra card whilst their score is < 17
- after dealer has played their hand, all player results are returned

# Assumptions
- tie score with dealer = dealer wins

# Expected Output

Implement the method `play` in class `BlackjackGame`, adding or modifying any other code in the project as required.

The `play` method returns an array of `PlayerResult`, which has two fields:
- `win` indicates whether or not the player beat the dealer (had a higher score without going bust)
- `description` a textual description of the outcome of the game for that player, including name, score and hand

Hands for each player should be dealt from the deck of cards passed as the second parameter to the `play` method. The
deck has already been shuffled.

Cards in a hand are described using two or three characters where the first indicates the rank of the card (numbers 2
to 10, J/Q/K/A for Jack/Queen/King/Ace) and the second indicates suit (D/H/C/S for Diamonds/Hearts/Clubs/Spades). For
example, the six of clubs is written '6C'.

Example output:

```
name=player-0, score=20 ([2S, 5C, 8C, 5D])
name=player-1, score=15 ([5H, KC])
name=player-2, score=17 ([JH, 7H])
name=player-3, score=21 ([AS, 10D])
```