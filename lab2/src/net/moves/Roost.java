package net.moves;

import ru.ifmo.se.pokemon.*;


public class Roost extends StatusMove {
    public Roost() {
        super(Type.FLYING, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon p) {
        int maxHP = (int) p.getStat(Stat.HP);
        //(int) Math.round(0.5 * maxHP)
        p.setMod(Stat.HP, +(int) Math.round(0.5 * maxHP));
    }

    @Override
    protected String describe() {
        return "восстанавливает половину от своей максимальной шкалы здоровья";
    }

}
