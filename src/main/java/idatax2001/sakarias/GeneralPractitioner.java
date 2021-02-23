package idatax2001.sakarias;
/**
 *  Holds information about a general practitioner
 */
public class GeneralPractitioner extends Doctor{

    /**
     * creates an instance of general practitioner
     * @param firstName             the general practitioners first name
     * @param lastName              the general practitioners last name
     * @param socialSecurityNumber  the general practitioners social security number
     */
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        super.setDiagnosis(patient, diagnosis);
    }
}
