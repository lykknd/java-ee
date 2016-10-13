package Spring4_JDBC.tx;

/**
 * UserAccountException
 *
 * @author Lcw 2015/11/14
 */
public class UserAccountException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public UserAccountException() {
        super();
    }

    public UserAccountException(String message, Throwable cause,
                                boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UserAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAccountException(String message) {
        super(message);
    }

    public UserAccountException(Throwable cause) {
        super(cause);
    }
}
