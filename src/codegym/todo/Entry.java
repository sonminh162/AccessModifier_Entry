package codegym.todo;

public class Entry {
    static int count = 0;
    private int priority;
    private String notes;


    public Entry() {
    }
    public Entry(int priority,String notes){
        this.priority = priority;
        this.notes = notes;
        count++;
    }
    public int getPriority(){
        return priority;
    }
    public String getNotes(){
        return notes;
    }
}
