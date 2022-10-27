package Debug;

public class DebugHelp {
    /**
     * Writes to the System.out to which file is being written.
     * @param fileLocation The location to be shown in System.out
     */
    public static void systemPrint_WriteTo(String fileLocation){
        System.out.printf("Writing to %s: ", fileLocation);
    }
    public static void systemPrint_ReadFrom(String fileLocation){
        System.out.printf("Reading from %s: ", fileLocation);
    }
}
