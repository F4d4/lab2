package net.moves;

import ru.ifmo.se.pokemon.*;

public class Tail_Whip extends StatusMove {
    public Tail_Whip() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "снижает защиту противника на одну ступень";
    }
}
