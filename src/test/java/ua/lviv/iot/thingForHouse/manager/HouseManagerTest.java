package ua.lviv.iot.thingForHouse.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.thingForHouse.model.AbstractHouse;
import ua.lviv.iot.thingForHouse.manager.HouseManager;

public class HouseManagerTest extends BaseHouseManager {
    public HouseManager houseManager;

    @BeforeEach
    public void setUp() {
        houseManager = new HouseManager();
        houseManager.addThings(availableHouse);
    }



    @Test
    public void testFindStuffForBarOfGlass() {
        List<AbstractHouse> thingsOfWidthAndLengthInCentimeters = houseManager.findThingForHouseByWidthAndLengthInCentimeters(203);
        Assertions.assertEquals(4, thingsOfWidthAndLengthInCentimeters.size());
        Assertions.assertEquals(243, thingsOfWidthAndLengthInCentimeters.get(0).getPriceInUAH());
        Assertions.assertEquals(253, thingsOfWidthAndLengthInCentimeters.get(1).getPriceInUAH());
        Assertions.assertEquals(289, thingsOfWidthAndLengthInCentimeters.get(2).getPriceInUAH());
        Assertions.assertEquals(359, thingsOfWidthAndLengthInCentimeters.get(3).getPriceInUAH());
    }
}
