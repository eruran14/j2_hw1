package com.company;

public class GraphicsCard {
    private String manufacturer;
    private int RAM;

    public GraphicsCard(String manufacturer, int RAM) {
        this.manufacturer = manufacturer;
        this.RAM = RAM;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRAM() {
        return RAM;
    }

}
