package com.company;

public class Computer {
    private String manufacturer;
    private String operatingSystem;
    private int year;
    private String CPU;
    private ScreenType screenType;
    private GraphicsCard graphicsCard;

    public Computer(String manufacturer, String operatingSystem, String CPU, ScreenType screenType, GraphicsCard graphicsCard) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.CPU = CPU;
        this.screenType = screenType;
        this.graphicsCard = graphicsCard;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getYear() {
        return year;
    }

    public String getCPU() {
        return CPU;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }
}
