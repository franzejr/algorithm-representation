package algorithmrepresentation;

/**
 * Builder for all algorithms
 *
 * @author franzejr
 */
public interface IAlgorithmBuilder {
    /*
     * @return Algorithm
     */
    public Algorithm getAlgorithm();
    /*
     * @return Algorithm Name
     */
    public String getName();
    /*
     * @return Algorithm Description
     */
    public String getDescription();
    
    /*
     * @return Algorithm Class
     */
    public Class<Algorithm> getAlgorithmClass();
    
}
