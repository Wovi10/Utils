package Debug;

public class FileDebugging{
    public static void systemPrint_WriteTo(String fileLocation){
        System.out.printf("Writing to %s: ", fileLocation);
    }
    public static void systemPrint_ReadFrom(String fileLocation){
        System.out.printf("Reading from %s: ", fileLocation);
    }
}
