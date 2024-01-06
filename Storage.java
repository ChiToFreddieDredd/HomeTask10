public class Storage extends Goods {
    public Storage(int value, int how, String tipe, int subValue) {
        super(value, how, tipe, how);
    }

    public void setValue(int subValue, int value, String tipe) {
    }

    public void sellGoods(String forSale, int how) {
        this.how = how;
        if(this.how<=how){
            how-=this.how;
            System.out.println("Добре ви продали" + tipe + "та отримали" + value + "$");
            yourMoney += value * how;
            System.out.println(yourMoney);
        }else{
            System.out.println("у вас не має стільки " + tipe);
            return;
        }
   
    }

}