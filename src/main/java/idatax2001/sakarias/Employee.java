package idatax2001.sakarias;

/**
 *  Holds information about an employee
 */
public class Employee extends Person{

    /**
     * creates an instance of employee
     * @param firstName             the employees first name
     * @param lastName              the employees last name
     * @param socialSecurityNumber  the employees social security number
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Employee: " + getFullName();
    }

}
