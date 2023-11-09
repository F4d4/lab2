package net;

import net.pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main extends Pokemon{
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon pikachu = new Pikachu("Пикачу", 1);
        Pokemon cloyster = new Cloyster("Клойстер", 1);
        Pokemon pichu = new Pichu("Пичу", 1);
        Pokemon raichu = new Raichu("Раичу", 1);
        Pokemon shelder = new Shellder("Шелдер", 1);
        Pokemon xurkitree = new Xurkitree("Ксуркитри", 1);
        b.addAlly(pichu);
        b.addAlly(shelder);
        b.addAlly(pikachu);
        b.addFoe(xurkitree);
        b.addFoe(raichu);
        b.addFoe(cloyster);
        b.go();
    }
}
