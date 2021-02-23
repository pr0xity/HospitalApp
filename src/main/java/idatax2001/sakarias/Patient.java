package idatax2001.sakarias;

/**
 *  This class holds information about a patient
 *  Name, social security number od diagnosis are stored
 *
 */
public class Patient extends Person implements Diagnosable{
    private String diagnosis = "";

    /**
     * Returns the patients diagnosis.
     * @return  the patients diagnosis
     *          returns empty string if no diagnosis
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * creates an instance of Patient
     * @param firstName             the patients first name
     * @param lastName              the patients last name
     * @param socialSecurityNumber  the patients social security number
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber){
    super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Patient: " + getFullName();
    }
}
