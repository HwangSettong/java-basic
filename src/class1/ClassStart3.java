package class1;

public class ClassStart3 {
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

        // 객체 값 사용
        System.out.println("이름:"+student1.name+" 나이:"+student1.age+" 성적:"+student1.grade);
        System.out.println("이름:"+student2.name+" 나이:"+student2.age+" 성적:"+student2.grade);
    }
}