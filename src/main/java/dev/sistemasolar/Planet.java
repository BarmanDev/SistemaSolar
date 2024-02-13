package dev.sistemasolar;

public class Planet {

    private String name = null;
    private int satellites = 0;
    private double mass = 0;
    private double volume = 0;
    private int diameter = 0;
    private int averageDistanceToSun = 0;
    private String type;
    private boolean observable;
    private double orbitalPeriod;
    private double rotationPeriod;

    public Planet() {
    }

    public Planet(String name, int satellites, double mass, double volume, int diameter, int averageDistanceToSun,String type, boolean observable, double orbitalPeriod, double rotationPeriod) {
        this.name = name;
        this.satellites = satellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceToSun = averageDistanceToSun;
        this.type = type;
        this.observable = observable;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
    }

    public double calculateDensy(){
        return mass/volume;
    }

    public boolean isExterior() {
        double distanceInKm = averageDistanceToSun * 149597870;
        return distanceInKm > 3.4 * 149597870;
    }

    @Override
    public String toString() {
        return "Planet [name=" + name + ", satellites=" + satellites + ", mass=" + mass + ", volume=" + volume
                + ", diameter=" + diameter + ", averageDistanceToSun=" + averageDistanceToSun + ", type=" + type
                + ", observable=" + observable + ", orbitalPeriod=" + orbitalPeriod + ", rotationPeriod="
                + rotationPeriod + "]";
    }













}
