package ua.lviv.iot.thingForHouse.model;

public class Sofas extends AbstractHouse{
    private String producerCountry;


    public String getProducerCountry() {

        return producerCountry;

    }


    public void setProducerCountry(String producerCountry) {

        this.producerCountry = producerCountry;

    }

    public Sofas(String materials, float priceInUAH, int productionYear, String productColour, int widthAndLengthInCentimeters, String producerCountry) {

        super(materials, priceInUAH, productionYear, productColour, widthAndLengthInCentimeters);

        this.producerCountry = producerCountry;

    }
}
