package dev.sistemasolar;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        String[] TypeOfPlanet = {"GASEOSO", "TERRESTRE", "ENANO"};

        Planet planet1 = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12756, 149, TypeOfPlanet[1], true, 1, 365.25);
        Planet planet2 = new Planet("Saturn", 82, 5.6834e26, 8.2713e14, 116460, 1433, TypeOfPlanet[0], true, 29.5, 0.45);


        System.out.println("Información del Planeta 1:");
        System.out.println(planet1.toString());
        System.out.println("Densidad del Planeta 1: " + planet1.calculateDensy() + " kg/km");
        System.out.println("¿Es el Planeta 1 un planeta exterior?: " + (planet1.isExterior() ? "Sí" : "No"));
        System.out.println();

        System.out.println("Información del Planeta 2:");
        System.out.println(planet2.toString());
        System.out.println("Densidad del Planeta 2: " + planet2.calculateDensy() + " kg/km³");
        System.out.println("¿Es el Planeta 2 un planeta exterior?: " + (planet2.isExterior() ? "Sí" : "No"));
    }
}
