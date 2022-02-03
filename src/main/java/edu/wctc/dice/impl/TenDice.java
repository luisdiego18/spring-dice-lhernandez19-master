package edu.wctc.dice.impl;

import edu.wctc.dice.iface.RollerDie;

import java.util.Random;

public class TenDice implements RollerDie {
    @Override
    public int RollerDie() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
