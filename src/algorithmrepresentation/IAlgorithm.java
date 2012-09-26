package algorithmrepresentation;

/**
 * Interface for all algorithms.So, there is a algorithm. If this algorithm
 * exists, so it must to implement these methods.
 *
 * @author franzejr
 */
public interface IAlgorithm {

    public void execute();

    public String getReport();

    public String getIdentifier();
}
