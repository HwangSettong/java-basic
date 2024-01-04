package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // public은 어디서나 접근 가능
        DefaultClass1 class1 = new DefaultClass1();  // default는 같은 패키지이므로 접근 가능
        DefaultClass2 class2 = new DefaultClass2();  // default는 같은 패키지이므로 접근 가능
    }
}
