package com.Sofka;

/**
 * Clase Ships creada para atributos exclusivos de la nave espacial
 * Los tributos son, el tipo número de propursores y el combustible
 */
public class Ships extends Spacecraft {
    private final String typeCraft;
    String fuel;
    int nProponents;

    /**
     * Método constructor para recolectar la información de los atributos de la nave espacial creada
     * @param typeCraft Variable que guarda el tipo de Nave espacial elegida
     * @param nProponents Variable que guarda el número de nave espacial según el destino
     * @param fuel variable que guardará el combustible usado dependiendo del destino
     */
    public Ships(String typeCraft, int nProponents, String fuel) {
        this.typeCraft =  typeCraft;
        this.nProponents = nProponents;
        this.fuel = fuel;
    }

    /**
     * Se genera speedUp de aceleración necdesaria para la clase abstracta
     */
    @Override
    public void speedUp() {
        this.speed = this.speed + 200;
        System.out.println(speed);
    }

    /**
     * Método getShip para mostrar los atributos de la Nave espacial creada por el usuario
     */
    public void getShip() {
        System.out.print( "Type de Spacecraft: " + typeCraft );
        System.out.print("Number de Proponents: " + nProponents );
        System.out.println("Fuel: " + fuel);



    }
}
