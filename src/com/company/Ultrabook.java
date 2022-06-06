package com.company;

public final class Ultrabook extends Laptop{
    public Ultrabook(String manufacturer, String operatingSystem, String CPU, ScreenType screenType, GraphicsCard graphicsCard) {
        super(manufacturer, operatingSystem, CPU, screenType, graphicsCard);
        setYear(setDefaultYear());
    }

    @Override
    public int setDefaultYear() {
        return random.nextInt(2019,2023);
    }
}
