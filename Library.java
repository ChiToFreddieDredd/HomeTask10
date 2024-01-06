public class Library {
    String status;
    String nameOfBook;
    String nameOfAuthor;
    int ageOfPrint;
Library(String nameOfBook, String nameOfAuthor,int ageOfPrint){
    this.nameOfAuthor = nameOfAuthor;
    this.ageOfPrint = ageOfPrint;
    this.nameOfBook = nameOfBook;
    this.status = status;
}
public int getAge(){
    return ageOfPrint;
}
public String getNameOfAuthor(){
    return nameOfAuthor;
}
public String getNameOfBook(){
    return nameOfBook;
}
public String setStatusToAvaible(){
    return status = "avaible";
    
}
public String setStatusToUnavaible(){
    return status ="unavaible";
}
}
