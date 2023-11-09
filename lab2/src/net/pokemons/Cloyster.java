package net.pokemons;

import net.moves.*;
import ru.ifmo.se.pokemon.*;

public class Cloyster extends Shellder {
    public Cloyster(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ICE);
        setStats(50, 95, 180, 85, 45, 70);
        addMove(new Frost_Breath());
        //setMove(new Supersonic(), new Confide(), new Withdraw(), new Frost_Breath());
    }
}
