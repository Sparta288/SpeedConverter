public class Main {

    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(10);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        BarkingDog.shouldWakeUp(true,1);

    }

}
