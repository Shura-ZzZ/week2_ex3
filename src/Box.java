public class Box<T> {
    private final int sizeBox;
    private Gen<?>[] box;
    private int sizeHow;

    public Box(int sizeBox) {
        box = new Gen<?>[sizeBox];
        this.sizeBox = sizeBox;
        sizeHow = 0;
    }

    public void put(T element) throws Exception {
        if (sizeHow == sizeBox)
            throw new Exception("box is full");
        Gen<T> object = new Gen<T>(element);
        box[sizeHow] = object;
        sizeHow++;

    }

    public T get() throws Exception {
        if (sizeHow == 0)
            throw new Exception("box is empty");
        int randomIndex = (int) (Math.random() * (sizeHow - 1));
        Gen<T> result = (Gen<T>) box[randomIndex];
        return result.getObject();

    }

    public boolean isEmpty() {
        return sizeHow == 0;
    }

    public int size() {
        return sizeHow;
    }

    public void remove() throws Exception {
        if (sizeHow == 0)
            throw new Exception("box is empty");
        sizeHow--;
        box[sizeHow] = null;
    }


}
