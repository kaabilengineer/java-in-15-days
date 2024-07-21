import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;
    public ToDoList() {
        tasks = new ArrayList<Task>();
    }
    public void addTask(String description) {
        tasks.add(new Task(description));
    }
    public void removeTask(int index){
        if (index>=0 && index < tasks.size()){
            tasks.remove(index);

        }else {
            System.out.println("Invalid index");
        }
    }
    public void markTaskAsDone(int index){
        if (index>=0 && index < tasks.size()){
            tasks.get(index).markAsDone();
        }else{
            System.out.println("Invalid index");
        }
    }
    public void viewTasks(){
        if (tasks.isEmpty()){
            System.out.println("No tasks");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
                }
        }
    }
}
