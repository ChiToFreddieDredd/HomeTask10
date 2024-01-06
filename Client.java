public class Client extends Library {
    Client(String nameOfBook, String nameOfAuthor, int ageOfPrint,String name) {
        super(nameOfBook, nameOfAuthor, ageOfPrint);
        this.name = name;
        // TODO Auto-generated constructor stub
    }

    String name;

    public void takeBook(String nameOfBook ) {
        if (status == "unavaible") {
            System.out.println("Книгу вже хтось взяв ");
            return;    
    }
     setStatusToUnavaible();
        
    }

    public void returnBook() {
     if (status=="avaible" && this.nameOfBook.equals(getNameOfBook())){
         System.out.println("ви не можете повернути вже повернуту книгу");
        return;
        }
        setStatusToAvaible();
        
    }
    public String getName(){
        return name;
    }
    public void printUserInfo(){
        System.out.println(name);
    }
}
