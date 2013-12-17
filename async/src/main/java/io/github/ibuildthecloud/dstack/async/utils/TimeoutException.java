package io.github.ibuildthecloud.dstack.async.utils;

public class TimeoutException extends RuntimeException {

    private static final long serialVersionUID = -6006003990363888144L;

    public TimeoutException() {
        super();
    }

    public TimeoutException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeoutException(String message) {
        super(message);
    }

    public TimeoutException(Throwable cause) {
        super(cause);
    }

}
