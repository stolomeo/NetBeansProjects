
public class Student {
	
    private String id;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String phone;
    private String email;   
    private int majorId;
    private String expectedGradDate;    
    private static int nNumberOfStudents; 
    public Student() {
    	nNumberOfStudents++;
    }

	public Student(String id, String firstName, String lastName, String street, String city, String state, int zipCode,
			String phone, String email, int majorId, String expectedGradDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phone = phone;
		this.email = email;
		this.majorId = majorId;
		this.expectedGradDate = expectedGradDate;
                nNumberOfStudents++;
	}

    public static int getnNumberOfStudents() {
        return nNumberOfStudents;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMajorId() {
		return majorId;
	}

	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

	public String getExpectedGradDate() {
		return expectedGradDate;
	}

	public void setExpectedGradDate(String expectedGradDate) {
		this.expectedGradDate = expectedGradDate;
	}   
    
            


}


