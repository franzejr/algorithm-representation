package algorithmrepresentation;

/**
 * Interface for all algorithms.So, there is a algorithm. If this algorithm
 * exists, so it must to implement these methods.
 *
 * @author franzejr
 */
public abstract class Algorithm {

    /*
     * Parameters which will be used by algorithm
     */
    Parameters parameters;
    
    /*
     * Result from the algorithm
     */
    IDataModel result;
    
    /*
     * @return result Re
     */

    public IDataModel getResult() {
        return this.result;
    }
    
    /*
     * You can look for this report when you want to know in what state 
     * is your algorithm
     * 
     */
    Report report;


    /*
     * The main method to execute the algorithm
     * 
     * @param data Input data
     * @param parameters Parameters which will be used in the algorithm
     */
    public abstract void execute(IDataModel data, Parameters parameters);

    /*
     * Unique string to indentify a algorithm
     */
    public abstract String getIdentifier();
}
