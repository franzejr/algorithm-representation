package algorithmrepresentation;

/**
 * A way to represent algorithm
 *
 * @author franzejr
 */
public class AlgorithmRepresentation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //With this implementation, it's possible to have two ways to execute
        //the algorithm
        //1)Using the Builder
        //2)Using the Algorithm byself

        IAlgorithmBuilder algorithm = new OpticsBuilder();
        algorithm.getAlgorithm().execute();

        IClusteringAlgorithm algorithm2 = new Optics();
        algorithm2.execute();
    }
}
