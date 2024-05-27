package com.ces.homework.homework_ibk;

import org.junit.jupiter.api.Test;

public class BaseBallGameTest {
    @Test
    public void scoreResultTest_1S2B() throws Exception {
        String given = "123";
        String input = "321";
        String returnMessage = BaseBallGame.getScore(given, input);
    }

    @Test
    public void scoreResultTest_1B() throws Exception {
        String given = "123";
        String input = "415";
        String returnMessage = BaseBallGame.getScore(given, input);
    }

    @Test
    public void scoreResultTest_3S() throws Exception {
        String given = "123";
        String input = "123";
        String returnMessage = BaseBallGame.getScore(given, input);
    }

    @Test
    public void scoreResultTest_null() throws Exception {
        String given = "123";
        String input = "456";
        String returnMessage = BaseBallGame.getScore(given, input);
    }
}
