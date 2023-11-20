public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("123 Blackpink Blvd", "Damian's Imagination", "NY", "5805");
        Address address2 = new Address("5805 Hylan Blvd", "Staten Island", "NY", "10309");

        Student student1 = new Student("John Doe", 12345, 3.75, address1);
        Student student2 = new Student("Jane Doe", 67890, 3.90, address1);
        Student student3 = new Student("Damian Metovic", 12345, 3.80, address2);

        // equals method test (student1 should equal student3 based on emplid)
        System.out.println("student1 equals student2: " + student1.equals(student2));
        System.out.println("student1 equals student3: " + student1.equals(student3));

        // Testing toString method
        System.out.println("student1: " + student1.toString());

        // copy method test
        Student student1Copy = student1.copy();
        System.out.println("student1 copy equals student1: " + student1Copy.equals(student1));

        // copy constructor test
        Student student1CopyConstructor = new Student(student1);
        System.out.println("student1 copy constructor equals student1: " +
                student1CopyConstructor.equals(student1));
    }
}