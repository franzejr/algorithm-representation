package algorithmrepresentation;

/**
 *With this builder is possible to create an algorithm.
 * @author franzejr
 */
public class OpticsBuilder implements IClusteringAlgorithm, IAlgorithmBuilder  {

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getReport() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getIdentifier() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //Method that only Clustering algorithms have
    @Override
    public Object clusterize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IAlgorithm getAlgorithm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Class getAlgorithmClass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}