/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/4/27 19:52
 * @version: 1.0
 * @modified By:
 */
public class GoodDog {

    private int size;
//    public int getSize(){
//        return size;
//    }
//    public void setSize(int s){
//        size = s;
//    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    void bark(){
        if (size > 60){
            System.out.println("Wooof!Wooof!");

        }
        else if(size>14){
            System.out.println("Ruff!Ruff!");
        }
        else{
            System.out.println("Yip!Yip!");
        }
    }
}
