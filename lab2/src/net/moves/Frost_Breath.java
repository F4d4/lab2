package net.moves;

import ru.ifmo.se.pokemon.*;

public class Frost_Breath extends SpecialMove {
    public Frost_Breath() {
        super(Type.ICE, 60, 90);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return super.calcCriticalHit(att, def) + 3;
    }



    @Override
    protected String describe() {
        return "наносит урон противнику и повышает силу критического удара";
    }

}
