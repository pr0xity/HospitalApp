package idatax2001.sakarias;

/**
 * A super class for persons
 *
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Return the persons social security number
     * @return the persons social security number
     */
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    /**
     * Set the persons social security number
     * @param socialSecurityNumber the persons social security number
     */
    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Return the persons firstname
     * @return the persons firstname
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Set the persons firstname
     * @param firstName the persons first name
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * Return the persons lastname
     * @return the persons lastname
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * Set the persons lastname
     * @param lastName the persons lastname
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Return the persons full name
     * @return the persons full name
     */
    public String getFullName(){
        StringBuilder fullName = new StringBuilder();
        fullName.append(getFirstName());
        fullName.append("\n");
        fullName.append(getLastName());
        return fullName.toString();
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Person: " + getFullName();
    }

    /**
     * Creates an instance of a Person
     * @param firstName             the persons firstname
     * @param lastName              the persons lastname
     * @param socialSecurityNumber  the persons social security number
     */
    public Person(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
