abstract class Predator extends Animal {
    abstract String  getFood(); //인터페이스의 메서드와 같은 역할. 상속받는 클래스에게 getFood() 구현을 강제한다.

    void printFood(){
        System.out.println(String.format("My food is %s", getFood()));
    }

    static int LEG_COUNT = 4; //추상 클래스의 상수는 static 선언을 해야 한다.
    static int speed(){
        return LEG_COUNT*30;
    }
}
