
public class App {
    public static void main(String[] args) throws Exception {
        Storage goods2 = new Storage(10,10,"coal",5);
        Goods goods1 = new Goods(10, 10, "stone", 30);
        Goods goods = new Goods(40, 40, "wood", 35);
        Student student = new Student(1);
        TaskSystem task = new TaskSystem(1);
        BankAccount count = new BankAccount("230303034","діма","коломійчук");
        Library library = new Library("How  to kill Deadpool","Francys",8);
        Client client = new Client("How to kill Deadpool","Francys",8,"Callos");
        Client client2= new Client("How to kill Deadpool","Francys",8,"");
        client.takeBook("How  to kill Deadpool");
        client2.takeBook("How to kill Deadpool");
        count.PutMoney(700);
        count.transitMoney(600, "90988098");
        task.setTitle("K.O"); 
        student.checkTask();
        goods2.sellGoods("coal", 2);
    }
}
