package Exceptions;

import java.security.PrivilegedActionException;

/**
 * FileNotFoundException
 * This class is a simple extension of Exception.
 * By using this class you don't have to worry about messages being set.
 *
 * @author - Wout Vinckevleugel (Wovi10)
 */
public class FileNotFoundException extends Exception {
    private static final String message = "The file given could not be found.";

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public FileNotFoundException() {
        System.err.println(message);
    }

    /**
     * Constructs a new exception with the specified detail customMessage.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param customMessage the detail customMessage. The detail customMessage is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public FileNotFoundException(String customMessage) {
        super(customMessage);
    }

    /**
     * Constructs a new exception with the specified cause and a detail
     * message of {@code (cause==null ? null : cause.toString())} (which
     * typically contains the class and detail message of {@code cause}).
     * This constructor is useful for exceptions that are little more than
     * wrappers for other throwables (for example, {@link
     * PrivilegedActionException}).
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     * @since 1.4
     */
    public FileNotFoundException(Throwable cause) {
        super(message, cause);
    }
}
