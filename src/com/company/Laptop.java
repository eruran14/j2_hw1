package com.company;

import java.util.Random;

public class Laptop extends Computer{
    Random random = new Random();

    public Laptop(String manufacturer, String operatingSystem, String CPU, ScreenType screenType, GraphicsCard graphicsCard) {
        super(manufacturer, operatingSystem, CPU, screenType, graphicsCard);
        super.setYear(setDefaultYear());
    }

    public final String printInfo(){
        return "Manufacturer: " + super.getManufacturer() +
                "\nOC: " + super.getOperatingSystem() +
                "\nYear: " + super.getYear() +
                "\nCPU: " + super.getCPU() +
                "\nScreen Type: " + super.getScreenType() +
                "\nGraphics Card Manufacturer: " + super.getGraphicsCard().getManufacturer() +
                "\nGraphics Card RAM: " + super.getGraphicsCard().getRAM();
    }

    public int setDefaultYear(){
        return random.nextInt(2015, 2022);
    }

}
