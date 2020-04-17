package ua.lviv.iot.thingForHouse.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.thingForHouse.model.AbstractHouse;

public class HouseManager {
    private List<AbstractHouse> things = new LinkedList<AbstractHouse>();

    public void addThings(List<AbstractHouse> things) {
        this.things.addAll(things);
    }
    public void addThing(AbstractHouse thing){
        this.things.add(thing);
    }

    public List<AbstractHouse> findThingForHouseByWidthAndLengthInCentimeters(int priceInUAH) {
        List<AbstractHouse> thingsOfWidthAndLengthInCentimeters = new LinkedList<AbstractHouse>();
        for (AbstractHouse price : things) {
            if (price.getPriceInUAH() > priceInUAH) {
                thingsOfWidthAndLengthInCentimeters.add(price);
            }
        }
        return thingsOfWidthAndLengthInCentimeters;
    }
}
