class Student {
    private String name;
    private int emplID;
    private double gpa;
    private Address address;

    // Constructor
    public Student(String name, int emplID, double gpa, Address address) {
        this.name = name;
        this.emplID = emplID;
        this.gpa = gpa;
        this.address = address;
    }

    // getters and setters implementation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmplID() {
        return emplID;
    }

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // equals method implementation
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return emplID == student.emplID;
    }

    // Implement the toString method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", emplID=" + emplID +
                ", gpa=" + gpa +
                ", address=" + address +
                '}';
    }

    // copy method implementation
    public Student copy() {
        Address copiedAddress = new Address(this.address.getStreet(), this.address.getCity(),
                this.address.getState(), this.address.getZipCode());
        return new Student(this.name, this.emplID, this.gpa, copiedAddress);
    }

    // copy constructor implementation
    public Student(Student otherStudent) {
        this.name = otherStudent.name;
        this.emplID = otherStudent.emplID;
        this.gpa = otherStudent.gpa;
        this.address = new Address(otherStudent.address.getStreet(),
                otherStudent.address.getCity(),
                otherStudent.address.getState(),
                otherStudent.address.getZipCode());
    }
}
