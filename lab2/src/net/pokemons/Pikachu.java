package net.pokemons;

import net.moves.*;
import ru.ifmo.se.pokemon.*;

public class Pikachu extends Pichu {
    public Pikachu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(35, 55, 40, 50, 50, 90);
        addMove(new Discharge());
        //setMove(new Tail_Whip(), new Charge_Beam(), new Discharge());
    }
}
