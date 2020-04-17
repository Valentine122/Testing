package ua.lviv.iot.thingForHouse.model;

public class Curbstones extends AbstractHouse {
    private int numberOfDrawers;
    private int weightInKg;

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public void setNumberOfDrawers(int numberOfDrawers) {
        this.numberOfDrawers = numberOfDrawers;
    }

    public int getWeight() {
        return weightInKg;
    }

    public void setWeight(int weight) {
        this.weightInKg = weight;
    }

    public Curbstones (String materials, float priceInUAH, int productionYear, String productColour, int widthAndLengthInCentimeters, int numberOfDrawers, int weightInKg) {
        super(materials, priceInUAH, productionYear, productColour, widthAndLengthInCentimeters);
        this.numberOfDrawers = numberOfDrawers;
        this.weightInKg = weightInKg;
    }

}
