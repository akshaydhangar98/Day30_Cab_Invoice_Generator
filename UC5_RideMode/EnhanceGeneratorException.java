package UC5_RideMode;

public class EnhanceGeneratorException extends Exception {

    public enum exception {

        SERVICE_NULL_EXCEPTION
    }

    public exception Type;

    public EnhanceGeneratorException(exception Type) {
        this.Type = Type;

    }
}