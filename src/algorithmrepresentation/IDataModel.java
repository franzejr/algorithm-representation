package algorithmrepresentation;

/**
 *
 * Abstraction Data, the DataModel can be input or output from the algorithm
 *
 * @author franzejr
 */
interface IDataModel {

    /*
     * @return Boolean representing the state of the transaction
     */
    public boolean create();
    /*
     * @return Boolean representing the state of the transaction
     */

    public boolean read();
    /*
     * @return Boolean representing the state of the transaction
     */

    public boolean update();
    /*
     * @return JSON String
     */

    public String makeJSONOut();
    /*
     * @return XML String
     */

    public String makeXMLOut();
}
