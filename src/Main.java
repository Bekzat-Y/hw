
public class Main {
    public static void main(String[] args) {
        ToDoListt.ToDoList toDoList = new ToDoListt.ToDoList();
        toDoList.addTask("купить продукты ");
        toDoList.addTask("завершить домашку ");
        toDoList.addTask("прогулятся");

        toDoList.displayTasks();

        System.out.println("отметить задачу как выполненую Ж купит продукты");
        toDoList.markTaskAsCompleted("купить продукты");

        System.out.println("Удалить задачуЖ завершить домашку");
        toDoList.deleteTask("завершить домашку");

        toDoList.displayTasks();
    }

}