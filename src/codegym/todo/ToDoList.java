package codegym.todo;

import static codegym.todo.Entry.count;

public class ToDoList{
    private Entry[] list = new Entry[20];
    private int length = 0;

    public int getMaxOfPriority(){
        int priorityMax = list[0].getPriority();
        for(int i = 1; i < length; i++) {
            if (list[i].getPriority() > priorityMax)
                priorityMax = list[i].getPriority();
        }
        return priorityMax;
    }
    public void showTodoList(){
        for(int i = getMaxOfPriority(); i >= 1;i--) {
            for (int j = 0; j < length; j++) {
                if (i == list[j].getPriority()) System.out.println(list[j].getNotes());
            }
        }
    }
    public boolean removeEntry(int id){
            for(int i = id; i < length; i++) {
                list[i-1] = list[i];
            }
            length--;
            return true;
    }

    public void addEntry(Entry entry){
        list[length] = entry;
        length++;
    }
    public Entry getEntryByID(int id){
        return list[id-1];
    }
}
