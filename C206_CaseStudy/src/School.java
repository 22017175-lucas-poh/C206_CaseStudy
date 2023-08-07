public class School {
    private String name;
    private String location;
    private int contactNumber;

    public School(String name, String location, int contactNumber) {
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    // Getter and setter methods for name, location, and contactNumber

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Method to display school information
    public void displaySchoolInfo() {
        System.out.println("School Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Contact Number: " + contactNumber);
    }
   
}