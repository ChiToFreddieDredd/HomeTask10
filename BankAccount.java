
public class BankAccount {
    int count;
    String numOfCount;

    public BankAccount(String MoreThanSixNumbers,String Name,String Surname){
        Name = Name.replaceFirst(Name.substring(0,1),Name.substring(0,1).toUpperCase());
        Surname = Surname.replaceFirst(Surname.substring(0,1), Surname.substring(0,1).toUpperCase());
        System.out.println(Name +" "+ Surname);
        

    if(MoreThanSixNumbers.length()<6)

    {
        System.out.println("number of count need be more than 6");
        return;
    }else
    {
        System.out.println("OK. now you creat account" + MoreThanSixNumbers);
        numOfCount = MoreThanSixNumbers;
    }

    }

    public int PutMoney(int Money){
        System.out.println(count+Money);
        return count+=Money;
    }

public void transitMoney(int Money,String numOfcount2){
    if( numOfcount2.length()<6){
        System.out.println("number of count need be more than 6");
        return;
    }else{
        System.out.println("OK. now you transit money to another account" + numOfcount2 );
    }
    if(Money>count){
    System.out.println("not enough money");
        return;    
    }else{
        count-=Money;
    }
    
}
}
