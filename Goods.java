import java.util.ArrayList;

public class Goods {
    int yourMoney = 500;
    String tipe;
    int how;
    int value;
    int subValue;
    public Goods(int value, int how, String tipe, int subValue) {
        yourMoney-=subValue;
        System.out.println(yourMoney + "ми забрали у вас" + subValue + "так як ви придбали" + tipe);
        ArrayList<String> goods = new ArrayList<>();
        if(subValue>yourMoney){
            System.out.println("не достатньо коштів");
            return;
        }
        
        if (subValue >= value) {
            System.out.println("Ціна занадто низька встановіть ціну вище");
            return;
        } else {

            System.err.println("Чудово ви встановили ціну для:" + tipe);
            goods.add(tipe);
            System.out.println(goods);
        }

    }
}