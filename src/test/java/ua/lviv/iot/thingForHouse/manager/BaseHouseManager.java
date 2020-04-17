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
    public void createStuffs() {
        availableHouse= new LinkedList<AbstractHouse>();
        availableHouse.add(new ComputerDesks("BARSKYGAMES", 100, 2002, "Blue", 250*250, 4, ProducerCompany.BARSKYGAMES));
        availableHouse.add(new ComputerDesks("ROKO", 200, 2012, "Black", 100*500, 6, ProducerCompany.ROKO));
        availableHouse.add(new Curbstones("BARSKYGAMES", 243, 2018, "Yellow", 450*450, 10, 18));
        availableHouse.add(new Curbstones("ROKO", 133, 2019, "Brawn", 150*150, 12,12));
        availableHouse.add(new DiningTables("BARSKYGAMES", 202, 2013, "Green", 300*250, 400, 2));
        availableHouse.add(new DiningTables("RAZER", 253, 2015, "Red", 175*125, 700,4));
        availableHouse.add(new Sofas("BARSKYGAMES", 289, 2011, "Purple", 185*195, "Poland"));
        availableHouse.add(new Sofas("RAZER", 359, 2020, "Orange", 225*345, "Ukraine"));

    }
}
