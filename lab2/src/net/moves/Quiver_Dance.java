package net.moves;

import ru.ifmo.se.pokemon.*;

public class Quiver_Dance extends StatusMove {
    public Quiver_Dance() {
        super(Type.BUG, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
        p.setMod(Stat.SPEED, 1);
    }

    @Override
    protected String describe() {
        return "повышает свою специальную защиту , специальную атаку и скорость на одну ступень";
    }
}
