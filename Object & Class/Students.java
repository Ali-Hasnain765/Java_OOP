public class Students {
  String name;
  String dob;
  String address;
  int semester;
  String id;
  float cgpa;

  public String studying(String books, String slides, String friends) {

    return "Good Marks";
  }

  public void display() {
    System.out.println("Student name: " + name);
    System.out.println("Student dob: " + dob);
    System.out.println("Student address: " + address);
    System.out.println("Student sem: " + semester);
    System.out.println("Student id: " + id);
    System.out.println("Student cgpa: " + cgpa);
  }
}