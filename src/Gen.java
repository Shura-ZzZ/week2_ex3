public class Gen<T> {
    private T object;

    public Gen(T object) {
        this.object= object;
    }

    public T getObject() {
        return object;
    }
}
