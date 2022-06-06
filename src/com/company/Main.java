package com.company;

public class Main {

    public static void main(String[] args) {
        GraphicsCard nVidia = new GraphicsCard("Nvidia", 512);
        Laptop lenovo = new Laptop("Lenovo", "Windows", "Intel i7", ScreenType.LCD, nVidia);
        System.out.println(lenovo.printInfo());

        System.out.println("_____________________");

        GraphicsCard nVidiaGeoForce = new GraphicsCard("Nvidia Geoforce", 2);
        Ultrabook hp = new Ultrabook("HP", "Windows", "Intel i9", ScreenType.LED, nVidiaGeoForce);
        System.out.println(hp.printInfo());

        System.out.println("__________________");

        GraphicsCard intel = new GraphicsCard("Intel", 1);
        Ultrabook mac = new Ultrabook("Apple", "MacOS","Intel i7", ScreenType.OLED, intel);
        System.out.println(mac.printInfo());
    }
}
