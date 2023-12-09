package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;           // Student클래스의 객체를 담아둘 변수 선언
        student1 = new Student();   // "new 클래스명()" 객체를 생성하여 참조값(메모리 주소)을 변수에 담기
        // 객체 값 대입
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 배열에 객체 참조값 대입
        /*
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        */
        Student[] students = {student1, student2};
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        // 때문에 객체의 참조값(메모리 주소)을 읽고 복사해서 배열에 대입한다.

        // 객체 값 사용
        /*
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:"+students[i].name+" 나이:"+students[i].age+" 성적:"+students[i].grade);
        }
        */
        // 향상된 for문
        for (Student student : students) {
            System.out.println("이름:"+student.name+" 나이:"+student.age+" 성적:"+student.grade);
        }
    }
}