package com.Sofka;
/**
 * Importación de variables necesarias para mostrar las diferentes atributos de las naves
 */

import static com.Sofka.Main.nProponents;
import static com.Sofka.Main.typeCraft;
import static com.Sofka.Main.fuel;

/**
 * clase abstracta y decalaración de variables de seún su tipo
 */
public abstract class Spacecraft {
    public int speed;
    public String mision, distance;
    public String destination, timeArrival, charge, nCrewe;
    public static String[] Craft = new String[5];
    public static int[] i = new int[1];
    public static String[] Ship = new String[5];

    /**
     * método abstracto  speeUp que se encargara de la velocidad o aceleración mostrada para la velocidad
     */

    public abstract void speedUp();

    public Spacecraft() {
        this.speed = speed + 400;
    }

    /**
     *  Constructor Spacecraft encargado de recopilar atributos de las naves spaqciales
     * @param mision variable que mostrara que mision lleva cada nave spacial
     * @param nCrew variable que indica eñ número de tripulantes
     * @param charge variable que indica la carga que llevará la nave si esta la amerita
     * @param destination variable que indica el destino de cada nave
     * @param distance Variable que indica la distancia que debe recorrer la nave según su destino
     * @param timeArrival variable que indica el tiempo estimado que tardará la nave en llegar a su destino
     * La variable i se va a encargarse de colocar en el array el espacio o posición para luego pedirla
     */
    public Spacecraft(String mision, String nCrew, String charge, String destination, String distance, String timeArrival) {
        this.mision = mision;
        this.nCrewe = nCrew;
        this.charge = charge;
        this.destination = destination;
        this.distance = distance;
        this.timeArrival = timeArrival;
        i[0] = i[0] + 1;
        speedUp();
    }

    /**
     * Método get que servira a la llamada del constructor en el Main
     */
    public void getSpacecraft() {
        System.out.print("Mision: " + mision);
        System.out.print("Number Crew: " + nCrewe);
        System.out.print("Charge: " + charge);
        System.out.print("Destination: " + destination);
        System.out.print("Distance:  " + distance);
        System.out.print("Time Arrival: " + timeArrival);
        System.out.println("Velocity:  " + speed + "\n");

        /**
         * Se guardara la información en los diferentes arreglos
         * Array Ship que guardara atributos de la Nave espacial
         * Array Craft que guardara los atributos por el cual fue creada
         */
        Ship[i[0]] = "Type de Spacecraft: " + typeCraft + "  Number de Proponents: " + nProponents + "  Fuel: " + fuel;
        Craft[i[0]] = "Mision: " + mision + "  Number Crew: " + nCrewe + "  Charge: " + charge +
                "  Destination: " + destination + "  Distance:  " + distance +
                "  Time Arrival: " + timeArrival + "  Velocity:  " + speed +"\n";



       }

}


