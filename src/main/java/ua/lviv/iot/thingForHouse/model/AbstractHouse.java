package ua.lviv.iot.thingForHouse.model;

public class AbstractHouse {
    protected String materials;
    protected float priceInUAH;
    protected int productionYear;
    protected String productColour;
    protected int widthAndLengthInCentimeters;

    public String getMaterials() {
        return materials;
    }


    public void setMaterials(String material) {
        this.materials = materials;
    }

    public float getPriceInUAH() {
        return priceInUAH;

    }

    public void setPriceInUAH(float priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductColour() {
        return productColour;
    }

    public void setProductColour(String productColour) {
        this.productColour = productColour;
    }

    public int getWidthAndLengthInCentimeters() {
        return widthAndLengthInCentimeters;
    }

    public void setWidthAndLengthInCentimeters(int widthAndLengthInCentimeters) {
        this.widthAndLengthInCentimeters = widthAndLengthInCentimeters;
    }

    public AbstractHouse(String materials, float priceInUAH, int productionYear, String productColour, int widthAndLengthInCentimeters) {
        this.materials = materials;
        this.priceInUAH = priceInUAH;
        this.productionYear = productionYear;
        this.productColour = productColour;
        this.widthAndLengthInCentimeters = widthAndLengthInCentimeters;
    }
}
