package net.moves;

import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove {
    public Supersonic() {
        super(Type.NORMAL, 0, 55);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        p.confuse();
    }

    @Override
    protected String describe() {
        return "сбивает цель с толку";
    }
}
