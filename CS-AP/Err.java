public final class Err<T> {
    public static enum Status {
        OK, ERR;

        public final boolean ok() {
            return this == OK;
        }

        public final boolean err() {
            return this == ERR;
        }
    }

    public final T object;
    public final String message;

    public Err(final T object) {
        this(object, null);
    }

    public Err(final T object, final String message) {
        this.object = object;
        this.message = message;
    }

    public Status status() {
        return message == null ? Status.OK : Status.ERR;
    }

    public boolean ok() {
        return status().ok();
    }

    public boolean err() {
        return status().err();
    }

    @Override
    public String toString() {
        return ok() ? object.toString() : "Err: " + message;
    }

    public static Err<Double> sqrt(final double n) {
        if (n < 0) return new Err<Double>(null, "sqrt: negative number");
        return new Err<Double>(Math.sqrt(n));
    }

    public static void main(final String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(-4));
        System.out.println(sqrt(2));
        System.out.println(sqrt(-2));
    }
}
