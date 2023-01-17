package student1;

/**
 *
 * @author Bruno
 */
public class StudentList {
    public static void main(String[] args){
        //Student1 s1 = new Student1("s1","Silva");
        Student1[] studentList = new Student1[3];
        studentList[0] = new Student1("s1","Silva");
        studentList[1] = new Student1("s1","Bruno");
        studentList[2] = new Student1("s1","Val");
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
        
    }
}
