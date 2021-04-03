package com.jitterted.ebp.blackjack;

public class Player {

    private int playerBalance;
    private int playerBet;
    private int totalAmountBet;

    public Player() {
        this.playerBalance = 0;
        this.playerBet = 0;
    }

    public Player(int playerBalance, int playerBet) {
        this.playerBalance = playerBalance;
        this.playerBet = playerBet;
    }

    public void playerDeposits(int amount) {
        playerBalance += amount;
    }

    public void playerBets(int betAmount) {
        playerBet = betAmount;
        playerBalance -= betAmount;
        totalAmountBet += betAmount;
    }

    public int playerBalance() {
        return playerBalance;
    }

    public void playerWins() {
        playerBalance += playerBet * 2;
    }

    public void playerLoses() {
        playerBalance += playerBet * 0;
    }

    public void playerTies() {
        playerBalance += playerBet * 1;
    }

    public int totalAmountBet() {
        return totalAmountBet;
    }
}
