package idatax2001.sakarias;
/**
 *  Holds information about an doctor
 */
public abstract class Doctor extends Employee {


        /**
         * creates an instance of doctor
         * @param firstName             the doctors first name
         * @param lastName              the doctors last name
         * @param socialSecurityNumber  the doctors social security number
         */
        public Doctor(String firstName, String lastName, String socialSecurityNumber){
            super(firstName, lastName, socialSecurityNumber);
        }



    /**
     * Set a diagnosis for a patient
     */
    public void setDiagnosis(Patient patient, String diagnosis){
        patient.setDiagnosis(diagnosis);
    }

}

