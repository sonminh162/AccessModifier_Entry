package codegym.test;

import codegym.todo.Entry;
import codegym.todo.ToDoList;

import java.util.Scanner;

public class TestToDo {
    public static void Add(ToDoList list,Entry entry){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add:\n1.Yes\n2.No");
        int choice = scanner.nextInt();
        if(choice == 1) {
            list.addEntry(entry);
            System.out.println("Added");
        }else System.out.println("cancel");

    }
    public static void Remove(ToDoList list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Remove Entry--");
        System.out.println("Enter ID:");
        int id = scanner.nextInt();
        System.out.println("Remove Confirm(1.Yes/2.No):");
        int choice2 = scanner.nextInt();
        if(choice2==1){
            if(list.removeEntry(id)) System.out.println("Removed ID"+id);
        }
    }
    public static void Display(ToDoList list){
        list.showTodoList();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Add a Entry--");
        System.out.println("Enter priority:");
        int level = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter notes:");
        String note = scanner.nextLine();

        ToDoList list = new ToDoList();
        Entry entry = new Entry(level,note);

        Add(list,entry);

        Entry entry1 = new Entry(3,"5h30-tap the duc buoi sang");
        Entry entry2 = new Entry(4,"6h00-an sang");
        Entry entry3 = new Entry(5,"6h30-di lam");
        list.addEntry(entry1);
        list.addEntry(entry2);
        list.addEntry(entry3);

        Remove(list);

        Display(list);



    }
}
