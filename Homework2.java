//Homework2.java
import java.util.Scanner;
class Student{
    int StudentNumber;
    String StudentName;
    String StudentMajor;
    long PhoneNumber;

    Student( ) { }

    //setter
    void setStudentNumber(int ID){
        StudentNumber = ID;
    }
    void setStudentName(String Name){
        StudentName = Name;
    }
    void setStudentMajor(String Major){
        StudentMajor = Major;
    }
    void setPhoneNumber(long PN){
        PhoneNumber = PN;
    }

    //getter
    int getStudentNumber(){
        return StudentNumber;
    }
    String getStudentName(){
        return StudentName;
    }
    String getStudentMajor(){
        return StudentMajor;
    }
    String getPhoneNumber(){
        String PhoneNumberString = Long.toString(PhoneNumber);
        return "0" + PhoneNumberString.substring(0,2) + "-" + PhoneNumberString.substring(2,6) + "-" + PhoneNumberString.substring(6,10);
    }
}
public class Homework2 {
    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s  = new Student();
        s.setStudentNumber(sc.nextInt());
        s.setStudentName(sc.next());
        s.setStudentMajor(sc.next());
        s.setPhoneNumber(sc.nextLong());





        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s1  = new Student();
        s1.setStudentNumber(sc.nextInt());
        s1.setStudentName(sc.next());
        s1.setStudentMajor(sc.next());
        s1.setPhoneNumber(sc.nextInt());



        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s2  = new Student();
        s2.setStudentNumber(sc.nextInt());
        s2.setStudentName(sc.next());
        s2.setStudentMajor(sc.next());
        s2.setPhoneNumber(sc.nextInt());


        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        System.out.printf("첫번째 학생: %d %s %s %s\n", s.getStudentNumber(), s.getStudentName(), s.getStudentMajor(), s.getPhoneNumber() );

        System.out.printf("두번째 학생: %d %s %s %s\n", s1.getStudentNumber(), s1.getStudentName(), s1.getStudentMajor(), s1.getPhoneNumber() );

        System.out.printf("세번째 학생: %d %s %s %s\n", s2.getStudentNumber(), s2.getStudentName(), s2.getStudentMajor(), s2.getPhoneNumber() );



    }
}
