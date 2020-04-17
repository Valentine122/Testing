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
    public void testThingForHouseByMaterial() {
        List<AbstractHouse> thingForHouseByMaterial = houseManager.findThingForHouseByMaterial(203);
        Assertions.assertEquals(4, thingForHouseByMaterial.size());
        Assertions.assertEquals(243, thingForHouseByMaterial.get(0).getPriceInUAH());
        Assertions.assertEquals(253, thingForHouseByMaterial.get(1).getPriceInUAH());
        Assertions.assertEquals(289, thingForHouseByMaterial.get(2).getPriceInUAH());
        Assertions.assertEquals(359, thingForHouseByMaterial.get(3).getPriceInUAH());
    }
}
