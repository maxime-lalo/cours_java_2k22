public class Movie{
    public String lastName;
    public String firstName;

    public Movie(String lastName, String firstName){
        setLastName(lastName);
        setFirstName(firstName);
    }

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}