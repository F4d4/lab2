package net.pokemons;

import net.moves.*;
import ru.ifmo.se.pokemon.*;

public class Raichu extends Pikachu {
    public Raichu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(60, 90, 55, 90, 80, 110);
        addMove(new Confide());
        //setMove(new Tail_Whip(), new Charge_Beam(), new Discharge(),new Confide());
    }
}
