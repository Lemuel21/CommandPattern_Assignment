package CmdPattern;

import java.util.Scanner;

public class Appliances {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        lights Lights = new lights();
        Thermostat thermostat = new Thermostat();
        musicPlayer MP = new musicPlayer();
        System.out.println("1. Turn on the lights");
        System.out.println("2. Turn off the lights");
        System.out.println("3. Increase the temperature of the thermostat");
        System.out.println("4. Decrease the temperature of the thermostat");
        System.out.println("5. Turn on the music");
        System.out.println("6. Turn off the music");
        System.out.println("Select Command: ");






        int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    PowerOn powerOn = new PowerOn(Lights);
                    System.out.print(powerOn.execute());
                    break;

                case 2:
                    PowerOff powerOff = new PowerOff(Lights);
                    System.out.print(powerOff.execute());
                    break;

                case 3:
                    IncreaseTemp increaseTemp = new IncreaseTemp(thermostat);
                    System.out.print(increaseTemp.execute());
                    break;

                case 4:
                    decreaseTemp DecreaseTemp = new decreaseTemp(thermostat);
                    System.out.print(DecreaseTemp.execute());
                    break;

                case 5:
                    turnOn Turnon = new turnOn(MP);
                    System.out.print(Turnon.execute());
                    break;

                case 6:
                    turnOff Turnoff = new turnOff(MP);
                    System.out.print(Turnoff.execute());
                    break;



            }

        }


    }
