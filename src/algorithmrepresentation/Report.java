package algorithmrepresentation;

/**
 ** Report is a log and issue container. Filled with information, details,
 * minor or major issues, it is stored in an issue list and can be retrieved to
 * present issues to end-users. Behavior is the same as a simple logging
 * library.
 *
 * @author franzejr
 */
public class Report {

    private String report;

    /**
     * @return the report
     */
    public String getReport() {
        return report;
    }

    /**
     * @param report the report to set
     */
    public void setReport(String report) {
        this.report = report;
    }
}
