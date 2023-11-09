package net.pokemons;

import net.moves.*;
import ru.ifmo.se.pokemon.*;

public class Shellder extends Pokemon {
    public Shellder(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(30, 65, 100, 45, 20, 40);
        setMove(new Supersonic(), new Confide(), new Withdraw());
    }
}
