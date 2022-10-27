package Debug;

/**
 * DebugHelp
 * This class provides basic debugging help for neat use in your code.
 * Use: just import the class and type DebugHelp.methodName to use that method
 *
 * @author - Wout Vinckevleugel (Wovi10)
 */
public class DebugHelp {
    /**
     * Writes to the System.out to which file is being written.
     * @param fileLocation The location to be shown in System.out
     */
    public static void systemPrint_WriteTo(String fileLocation){
        System.out.printf("Writing to %s: ", fileLocation);
    }

    /**
     * Writes to the System.out from which file is being read.
     * @param fileLocation The location to be shown in System.out
     */
    public static void systemPrint_ReadFrom(String fileLocation){
        System.out.printf("Reading from %s: ", fileLocation);
    }
}
