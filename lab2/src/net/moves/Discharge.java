package net.moves;

import ru.ifmo.se.pokemon.*;


public class Discharge extends SpecialMove {
    public Discharge() {
        super(Type.ELECTRIC, 80, 100);
    }



    @Override
    public void applyOppEffects(Pokemon p) {
        if (!p.hasType(Type.ELECTRIC)) {
            Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон по противнику, с вероятностью 30% парализует цель";
    }
}
