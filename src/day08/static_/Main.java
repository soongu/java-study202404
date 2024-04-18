package day08.static_;

public class Main {

    public static void main(String[] args) {


        // static 데이터는 객체생성 없이 접근 가능
        Count.x = 20;

        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();
        c1.m2();
        c2.m2();

        c1.y = 10;
        c2.y = 20;

        Count.x = 99;
        Count.x = 50;

        System.out.println("c1.x = " + Count.x);
        System.out.println("c2.x = " + Count.x);
        System.out.println("==================");
        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);
    }
}
