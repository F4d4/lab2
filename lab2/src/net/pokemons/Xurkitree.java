package net.pokemons;

import net.moves.*;
import ru.ifmo.se.pokemon.*;


public class Xurkitree extends Pokemon {
    public Xurkitree(String name,int level){
        super(name,level);
        setType(Type.ELECTRIC);
        setStats(83,89,71,173,71,83);
        setMove(new Roost(),new Swagger(), new Quiver_Dance(), new Low_Sweep());
    }
}
