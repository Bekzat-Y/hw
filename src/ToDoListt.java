import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class ToDoListt {

        static class Task {
            String description;
            boolean completed;

            public Task(String description) {
                this.description = description;
                this.completed = false;
            }
        }

        public static class ToDoList {
            private List<Task> tasks;

            public ToDoList() {
                this.tasks = new ArrayList<>();
            }

            public void addTask(String description) {
                tasks.add(new Task(description));
            }

            public void markTaskAsCompleted(String description) {
                for (Task task : tasks) {
                    if (task.description.equals(description)) {
                        task.completed = true;
                    }
                }
            }

            public void deleteTask(String description) {
                Iterator<Task> iterator = tasks.iterator();
                while (iterator.hasNext()) {
                    Task task = iterator.next();
                    if (task.description.equals(description)) {
                        iterator.remove();
                    }
                }
            }

            public void displayTasks() {
                for (Task task : tasks) {
                    System.out.println("Task: " + task.description + ", Completed: " + task.completed);
                }
            }

            public static void main(String[] args) {
                ToDoList toDoList = new ToDoList();
                toDoList.addTask("Buy groceries");
                toDoList.addTask("Complete homework");
                toDoList.addTask("Go for a run");

                toDoList.displayTasks();

                System.out.println("Marking task as completed: Buy groceries");
                toDoList.markTaskAsCompleted("Buy groceries");

                System.out.println("Deleting task: Complete homework");
                toDoList.deleteTask("Complete homework");

                toDoList.displayTasks();
            }
        }
    }

