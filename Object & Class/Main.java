public class Main{
public static void main(String[]args){
    Students st =new Students();
    st.name ="Karim";
    st.address="DIU Smart City";
    st.dob="12-06-2000";
    st.semester= 4;
    st.id="213-35-877";
    st.cgpa=3.89f;

    st.display();
    System.out.println(st.studying("OOP with Java", "Java OOC", "Mahi"));
}
}
