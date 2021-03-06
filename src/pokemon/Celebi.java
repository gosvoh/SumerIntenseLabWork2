package pokemon;

import attack.special.AncientPower;
import attack.status.SwordDance;
import attack.physical.Facade;
import attack.special.EnergyBall;
import ru.ifmo.se.pokemon.*;

public class Celebi extends Pokemon {
    public Celebi(String name){
        this(name, 65);
    }

    protected Celebi(String name, int lvl){
        super(name, lvl);
        this.setStats(100, 100, 100, 100, 100, 100);
        this.addMove(new SwordDance());
        this.addMove(new AncientPower());
        this.addMove(new Facade());
        this.addMove(new EnergyBall());
    }
}