package ua.lviv.iot.thingForHouse.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.thingForHouse.model.AbstractHouse;
import ua.lviv.iot.thingForHouse.model.ComputerDesks;
import ua.lviv.iot.thingForHouse.model.Curbstones;
import ua.lviv.iot.thingForHouse.model.DiningTables;
import ua.lviv.iot.thingForHouse.model.Sofas;
import ua.lviv.iot.thingForHouse.model.ProducerCompany;

public class BaseHouseManager {
    protected List<AbstractHouse> availableHouse;

    @BeforeEach
    public void createThings() {
        availableHouse= new LinkedList<AbstractHouse>();
        availableHouse.add(new ComputerDesks("Metal", 100, 2002, "Blue", 250*250, 4, ProducerCompany.BARSKYGAMES));
        availableHouse.add(new ComputerDesks("Wood", 200, 2012, "Black", 100*500, 6, ProducerCompany.ROKO));
        availableHouse.add(new Curbstones("Plastic", 243, 2018, "Yellow", 450*450, 10, 18));
        availableHouse.add(new Curbstones("Wood", 133, 2019, "Brawn", 150*150, 12,12));
        availableHouse.add(new DiningTables("Plastic", 202, 2013, "Green", 300*250, 400, 2));
        availableHouse.add(new DiningTables("Metal", 253, 2015, "Red", 175*125, 700,4));
        availableHouse.add(new Sofas("Plastic", 289, 2011, "Purple", 185*195, "Poland"));
        availableHouse.add(new Sofas("Metal", 359, 2020, "Orange", 225*345, "Ukraine"));

    }
}
