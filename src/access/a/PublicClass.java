package access.a;

// Public 클래스는 하나만 생성 가능. 파일명과 클래스명이 같아야 함.
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // public은 어디서나 접근 가능
        DefaultClass1 class1 = new DefaultClass1();  // default는 같은 패키지이므로 접근 가능
        DefaultClass2 class2 = new DefaultClass2();  // default는 같은 패키지이므로 접근 가능
    }
}

// Default 클래스는 여러개 생성 가능.
class DefaultClass1 {

}
class DefaultClass2 {

}
