package algorithmrepresentation;

import java.util.HashMap;

/**
 *
 * Parameters commonly used in algorithms.With this parameters is possible
 * represent some algorithm you want, because the input of an algorithm can be a
 * representation of itself.
 *
 * @author franzejr
 */
public class Parameters {

    private HashMap<String, Object> parameters;

    public void addParam(String name, Object o) {
        parameters.put(name, o);
    }

    public void removeParam(Object o) {
        parameters.remove(o);
    }

    public void updateParam(String name, Object o) {
        parameters.put(name, o);
    }
}