package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PlayerTest {

    @Test
    public void playerBets0and0TotalAmountBetIs0() throws Exception {
        Player player = new Player();

        player.playerBets(0);
        player.playerBets(0);

        assertThat(player.totalAmountBet())
                .isEqualTo(0);
    }

    @Test
    public void playerBets10and15TotalAmountBetIs25() throws Exception {
        Player player = new Player();

        player.playerBets(10);
        player.playerBets(15);

        assertThat(player.totalAmountBet())
                .isEqualTo(25);
    }
}
