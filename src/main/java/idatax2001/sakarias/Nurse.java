package idatax2001.sakarias;
/**
 *  Holds information about a nurse
 */
public class Nurse extends Employee{

    /**
     * creates an instance of nurse
     * @param firstName             the nurses first name
     * @param lastName              the nurses last name
     * @param socialSecurityNumber  the nurses social security number
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Nurse: " + getFullName();
    }
}
