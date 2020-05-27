/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/4/27 20:05
 * @version: 1.0
 * @modified By:
 */
public class GoodDogTestDrive {
    public static void main(String[] args){
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(10);
        System.out.println("Dog one "+one.getSize());
        one.bark();
        System.out.println("Dog two "+two.getSize());
        two.bark();
    }
}
