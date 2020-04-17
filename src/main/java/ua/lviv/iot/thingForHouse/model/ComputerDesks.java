package ua.lviv.iot.thingForHouse.model;

public class ComputerDesks extends AbstractHouse {
    private int amountOfMobileCurbstone;
    private ProducerCompany producerCompany;

    public int getAmountOfMobileCurbstone() {
        return amountOfMobileCurbstone;
    }

    public void setAmountOfMobileCurbstone(int amountOfMobileCurbstone) {
        this.amountOfMobileCurbstone = amountOfMobileCurbstone;
    }

    public ProducerCompany getProducerCompany() {
        return producerCompany;
    }

    public void setProducerCompany(ProducerCompany producerCompany) {
        this.producerCompany = producerCompany;
    }

    public ComputerDesks(String materials, float priceInUAH, int productionYear, String productColour, int widthAndLengthInCentimeters, int amountOfMobileCurbstone, ProducerCompany producerCompany) {
        super(materials, priceInUAH, productionYear, productColour, widthAndLengthInCentimeters);
        this.amountOfMobileCurbstone = amountOfMobileCurbstone;
        this.producerCompany = producerCompany;
    }
}
