package net.moves;

import ru.ifmo.se.pokemon.*;


public class Low_Sweep extends PhysicalMove {
    public Low_Sweep() {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    public void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "атакует противника и снижает его скорость на одну ступень";
    }

}
