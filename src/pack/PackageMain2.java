package pack;

import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지에 있으면 그냥 사용할 수 있음.
        User user = new User(); // 다른 패키지에 있으면 패키지 경로를 포함해서 적어줘야 함.
    }
}
