public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int convertBytes = kiloBytes;
            int megaBytes = (convertBytes / 1024);
            int remainingkiloByte = (convertBytes % 1024);
            System.out.println(convertBytes + " KB = " + megaBytes + " MB and " + remainingkiloByte + " KB");

        }
    }
}
