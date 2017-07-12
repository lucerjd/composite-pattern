package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jlucero on 7/12/17.
 */
public class Composite implements Component {
    private List children = new ArrayList<Component>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component get(int index) {
        if (index < children.size()) {
            return (Composite) children.get(index);
        }
        return null;
    }
}
