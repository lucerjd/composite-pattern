package composite;

/**
 * Interface class for composite pattern.  Used for both Composite and Leaf classes.
 * Created by jlucero on 7/12/17.
 */
public interface Component {
    void add(Component component);
    void remove(Component component);
    Component get(int index);
}
