package ua.lviv.iot.thingForHouse.model;

public class DiningTables extends AbstractHouse {

    private int depthInMillimeters;
    private int theThicknessOfTheWorktop;


    public int getDepthInMillimeters() {

        return depthInMillimeters;

    }


    public void setDepthInMillimeters(int depthInMillimeters) {

        this.depthInMillimeters = depthInMillimeters;

    }

    public int getTheThicknessOfTheWorktop() {
        return theThicknessOfTheWorktop;
    }

    public void setTheThicknessOfTheWorktop(int theThicknessOfTheWorktop) {
        this.theThicknessOfTheWorktop = theThicknessOfTheWorktop;
    }

    public DiningTables(String materials, float priceInUAH, int productionYear, String productColour, int widthAndLengthInCentimeters, int depthInMillimeters, int theThicknessOfTheWorktop) {

        super(materials, priceInUAH, productionYear, productColour, widthAndLengthInCentimeters);

        this.depthInMillimeters = depthInMillimeters;
        this.theThicknessOfTheWorktop = theThicknessOfTheWorktop;

    }
}
