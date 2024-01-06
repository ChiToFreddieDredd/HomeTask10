import java.util.ArrayList;

public class TaskSystem {
    
    String status;
    String discription;
    String title;
    ArrayList<Integer> tasks = new ArrayList<>();
    public TaskSystem(int place){
        tasks.add(place);   
    }

    public String setDiscription(String discription) {
        this.discription = discription;
        System.out.println(discription);
        return discription;
    }

    public String setTitle(String title) {
        setStatus();
        this.title = title;
        System.out.println(title);
        return title;

    }

    public void removeTask() {
        setDiscription("Завдання було видалено");
        setTitle("Завдання було видалене");
    }
    private String setStatus(){
        return status ="to do";
    }
   
}
