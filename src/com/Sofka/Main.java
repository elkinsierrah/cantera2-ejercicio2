package com.Sofka;
/**
 * Programa de Naves Espaciales con elección de Lanzamiento Versión 2.0
 *
 * @Autor: Elkin Sierra Hernández
 * Importación de librería, clases y recursos
 */

import java.util.Scanner;

import static com.Sofka.Main.showAll.showSpacecraft;

/**
 * Declaración de Variables
 */
public class Main {
    public static Scanner num = new Scanner(System.in);
    public static String typeCraft, charge, nCrew, destination, timeArrival, fuel, distance, mision;
    public static int option, select, exit, numberCraft, nProponents, nProponentsf, idCraft, save = 0;


    /**
     * Se crea el ciclo do while para controlar la ejecución del programa
     *
     * @param args usamos las variables option para la captura de las opciones ingresada por el usuario
     */
    public static void main(String[] args) {
        do {
            mainOption();
            option = captureOption();
            exit = evaluteOption(option);
        } while (exit != 0);
    }

    /**
     * Creamos la clase main (menú) paa mostrar las opciones al usuario para crear el tipo de naves o salir el sistema
     * para esto los valores vienen de 1 al 3 y el 0 (cero) para terminar el programa
     */
    public static void mainOption() {
        System.out.println("\nWHAT DO YO WANT TO DO??");
        System.out.println("1. CREATE SPACECRAFT");
        System.out.println("2. Show Created Spacecraft");
        System.out.println("0. EXIT THE SYSTEM");
    }

    /**
     * Se crea una clase especial captureOption la cual captura el dato ingresado por el usuario
     * @return toma la selección y retorna el valor ingresado por el usuario
     */
    public static int captureOption() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int evaluteOption(int option) {
        numberCraft = numberCraft + 1;
        /**
         * Se crea condicional switch que controla la elección del tipo de Nave a crear según las opciones
         * Retorna la variable Opción para ser evaluada
         * statusCraft variable que mostrará el estatus de creación de nave
         * numberDestination Variable que se usara para controlar carasteristicas de uso de cada nave
         * NumberRocket() llamado a la clase de elección de propursores
         */
        switch (option) {
            case 1 -> creationSpacecraft();
            case 2 -> showSpacecraft();
        }
        return option;
    }

    /**
     * Menú para elección de la creación del tipo de naves espaciales
     */

    public static void creationSpacecraft() {
        System.out.println("Indicate the type of Spacecraft to create: \n" +
                "1. Shuttle Vehicles \n" +
                "2. Unmanned Spacecraft \n" +
                "3. Manned Spacecraft \n");
        select = num.nextInt();
        /**
         * Se realiza un condicional para que guarde en una variable el tipo de nave espacial que se eligio crear
         */
        if (select == 1) {
            typeCraft = "Shuttle Vehicles";
            idCraft = 1;
        } else if (select == 2) {
            typeCraft = "Unmanned Spacecraft";
            idCraft = 2;
        } else if (select == 3) {
            typeCraft = "Manned Spacecraft";
            idCraft = 3;
        }
        typeMision();
    }

    /**
     * Se creo este menú de elección de la misión que se elije para poder determinar algunos atributos
     * Los atributos a elegir si son Tripuladas y cuantos tripulantes  o solo llevan carga.
     */
    public static void typeMision() {
        System.out.println("Indicate whether the vessel will be cargo carrying or manned:\n" + "1. Charge");
        if (idCraft != 2) {
            System.out.println("2. Crew \n");
        }
        option = num.nextInt();
        switch (option) {
            case 1 -> {
                System.out.println("Indicate the charge to be carried");
                System.out.println("\n1. Satelite " + "\n2. Probe");
                if (idCraft != 2) {
                    System.out.println("3. Fuel \n");
                }
                nCrew = "No Crew";
                option = num.nextInt();
                if (option == 1) {
                    charge = "Satelite";
                } else if (option == 2) {
                    charge = "Fuel";
                } else if (option == 3) {
                    charge = "Probe";
                }
            }
            case 2 -> {
                System.out.println("Indicate the number of crew members:\n 1. No Crew \n 2. Two Crew \n 3. Three Crew");
                charge = "No Charge";
                select = num.nextInt();
                if (select == 1) {
                    nCrew = "No Crew";
                } else if (select == 2) {
                    nCrew = "Two Crew";
                } else if (select == 3) {
                    nCrew = "Three Crew";
                }
            }
        }
        destinations();
    }

    /**
     * Se crea condicionales para indicar atributos que dependen del destino dependiendo del tipo de nave espacial
     */
    public static void destinations() {
        if (idCraft == 1) {
            //Elección para NAVES ESPACIALES DE TRANSPORTE.
            System.out.println("Select  your Destination: \n 1. Space\n 2. The Moon");
            option = num.nextInt();
            if (option == 1) {
                destination = "Space ";
                distance = "118 km ";
                timeArrival = "90 minutes ";
                fuel = "Liquid Hydrogen";
                nProponents = 2;
            } else if (option == 2) {
                destination = "The Moon ";
                distance = "384,400 km ";
                timeArrival = "5.5 days ";
                fuel = " Green Propellant Infusion ";
                nProponents = 2;
            }
            mision = "Transporting charge to " + destination;
        } else if (idCraft == 2) {
            //Elección para NAVES ESPACIALES NO TRIPULADAS.
            System.out.println("Select  your Destination 1. Saturno y sus lunas / 2. Júpiter / 3. Marte");
            System.out.println("4. Mercurio / 5. Plutón / 6. Urano / 7. Neptuno / 8. Venus / 9 . Sol ");
            option = num.nextInt();
            nCrew = "No Crew";
            switch (option) {
                case 1 -> {
                    destination = " Saturno´s  Moons ";
                    timeArrival = " 7 Years ";
                    distance = " 1.200 million  km ";
                    fuel = " Tetroxide of Nitrogen ";
                    nProponents = 3;
                }
                case 2 -> {
                    destination = " Jupiter ";
                    timeArrival = " 1.600.000 years ";
                    distance = "590.000.000 km";
                    fuel = " Hydrazine  ";
                    nProponents = 3;
                }
                case 3 -> {
                    destination = " Marte ";
                    timeArrival = " 400 a 450 days.";
                    distance = " 225,000,000 de km ";
                    fuel = " Hydrazine ";
                    nProponents = 3;
                }
                case 4 -> {
                    destination = " Mercurio ";
                    timeArrival = " 88 days ";
                    distance = " 149,600,000 de km";
                    fuel = " Magnesium ";
                    nProponents = 3;
                }
                case 5 -> {
                    destination = " Pluto ";
                    timeArrival = " 9,5 years ";
                    distance = " 5000.000.000 km ";
                    fuel = " Propergol ";
                    nProponents = 4;
                }
                case 6 -> {
                    destination = " Uranus  ";
                    timeArrival = " 15 years";
                    distance = " 4300 million km";
                    fuel = " Nuclear Fuel ";
                    nProponents = 4;
                }
                case 7 -> {
                    destination = " Neptuno ";
                    timeArrival = " 165 years ";
                    distance = " 4500 millions km";
                    fuel = "  Nuclear Fuel ";
                    nProponents = 4;
                }
                case 8 -> {
                    destination = " Venus ";
                    timeArrival = " 2 year ";
                    distance = " 40.000.000 km ";
                    fuel = " Propergol ";
                    nProponents = 3;
                }
                case 9 -> {
                    destination = " Sol ";
                    timeArrival = " 166 years ";
                    distance = " 150.000.000 km ";
                    fuel = " Synthetic Chemical  ";
                    nProponents = 3;
                }
            }
            mision = "Investigation to " + destination;
        } else if (idCraft == 3) {
            //Elección para NAVES ESPACIALES TRIPULADAS.
            System.out.println("Select  your Destination 1. Lunar Missions/ 2. Space Investigation");
            option = num.nextInt();
            if (option == 1) {
                destination = " The Moon ";
                distance = "384,400 km";
                timeArrival = " 5.5 days ";
                fuel = " Green Propellant Infusion ";
                nProponents = 2;
            } else {
                if (option == 2) {
                    destination = " Space ";
                    timeArrival = " 90 minutes ";
                    distance = " 700 km";
                    fuel = " Liquid Hydrogen";
                    nProponents = 2;
                }
                mision = "Send researchers to " + destination;
            }
        }
        createSpacecraft();
    }

    /**
     * Se Genera el constructor para laq creación de la Nave spacial según el tipo elegido
     * Depende del destino la cantidad de propursoires y la velocidad que tendra
     */
    public static void createSpacecraft() {
        save = save + 1;
        if (save == 1) {
            Ships SpaceCraftOne = new Ships(typeCraft, nProponents, fuel);
            Spacecraft SpaceCratmisonOne = new Spacecraft(mision, nCrew, charge, destination, distance, timeArrival) {
                @Override
                public void speedUp() {
                    nProponentsf = nProponents * 600;
                    speed = nProponentsf + 1400;
                }
            };
            SpaceCraftOne.getShip();
            SpaceCratmisonOne.getSpacecraft();


        } else if (save == 2) {
            Ships SpaceCraftTwo = new Ships(typeCraft, nProponents, fuel);

            Spacecraft SpaceCratmisonTwo = new Spacecraft(mision, nCrew, charge, destination, distance, timeArrival) {

                @Override
                public void speedUp() {
                    nProponentsf = nProponents * 600;
                    speed = nProponentsf + 1400;
                }
            };
            SpaceCraftTwo.getShip();
            SpaceCratmisonTwo.getSpacecraft();
        } else if (save == 3) {
            Ships SpaceCraftThree = new Ships(typeCraft, nProponents, fuel);
            Spacecraft SpaceCratmisonThree = new Spacecraft(mision, nCrew, charge, destination, distance, timeArrival) {
                @Override
                public void speedUp() {
                    nProponentsf = nProponents * 600;
                    speed = nProponentsf + 1400;
                }
            };
            SpaceCraftThree.getShip();
            SpaceCratmisonThree.getSpacecraft();
        } else if (save == 4) {
            Ships SpaceCraftFour = new Ships(typeCraft, nProponents, fuel);
            Spacecraft SpaceCratmisonFour = new Spacecraft(mision, nCrew, charge, destination, distance, timeArrival) {
                @Override
                public void speedUp() {
                    nProponentsf = nProponents * 600;
                    speed = nProponentsf + 1400;
                }
            };
            SpaceCraftFour.getShip();
            SpaceCratmisonFour.getSpacecraft();
        }
    }


    /**
     * Se podrá consultar las naves creadas, su máximo de creación del sistema son 4 naves
     */
        public abstract static class showAll extends Spacecraft {
            public static void showSpacecraft() {
                System.out.println("First Spacecraft");
                System.out.println(Ship[1]);
                System.out.println(Craft[1]);
                System.out.println("Second Spacecraft");
                System.out.println(Ship[2]);
                System.out.println(Craft[2]);
                System.out.println("Third Spacecraft");
                System.out.println(Ship[3]);
                System.out.println(Craft[3]);
                System.out.println("Fourth Spacecraft");
                System.out.println(Ship[4]);
                System.out.println(Craft[4]);
            }
        }

    }



