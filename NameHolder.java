
public abstract class NameHolder {

	protected String firstName;
	
	public abstract String describeSelf(); // once you make a collection, you can use this to describe self
	
	@Override
	public String toString() {
		return "First name: " + firstName;
	}
	
	
	protected void setFirstName(String firstName) throws NameException {
		if (!firstName.isEmpty()) {
			this.firstName = firstName; 
		}
		else
			throw new NameException("wrong"); 
	}
	
	protected String getFirstName() {
		return this.firstName;
	}
}
