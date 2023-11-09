package net.moves;

import ru.ifmo.se.pokemon.*;

public class Charge_Beam extends SpecialMove {
    public Charge_Beam() {
        super(Type.ELECTRIC, 50, 90);
    }



    @Override
    public void applySelfEffects(Pokemon p) {
        double chance = 0.7;
        double check = Math.random();
        if (chance >= check) {
            p.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон по противнику, с вероятностью 70% повышает на одну ступень свою специальную атаку";
    }

}
