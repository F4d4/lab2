package net.moves;

import ru.ifmo.se.pokemon.*;

public class Withdraw extends StatusMove {
    public Withdraw() {
        super(Type.WATER, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "повышает свою защиту на одну ступень";
    }

}
