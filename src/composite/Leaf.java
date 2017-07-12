package composite;

/**
 * Created by jlucero on 7/12/17.
 */
public class Leaf implements Component {
    public void add(Component component) {
        //No op
    }

    public void remove(Component component) {
        // No Op
    }

    public Component get(int index) {
        return this;
    }
}
