public class Student extends TaskSystem {

    public Student(int place) {
        super(place);
       
    }
    public void checkTask(){
    System.out.println(tasks);
}
public void done(int place){
    status = "done";
if(status.equals("done")){
    tasks.remove(place);
}
}

}
