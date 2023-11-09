package net.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.FLYING, 0, 85);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        p.confuse();
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return " вызывает у противника растерянность и увеличивает атаку соперника в 2 раза";
    }
}


