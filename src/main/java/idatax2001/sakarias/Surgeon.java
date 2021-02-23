package idatax2001.sakarias;
/**
 *  Holds information about a surgeon
 */
public class Surgeon extends Doctor{

    /**
     * creates an instance of surgeon
     * @param firstName             the surgeons first name
     * @param lastName              the surgeons last name
     * @param socialSecurityNumber  the surgeons social security number
     */
    public Surgeon(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        super.setDiagnosis(patient, diagnosis);
    }
}
