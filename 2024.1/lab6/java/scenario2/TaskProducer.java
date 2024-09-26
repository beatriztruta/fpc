public class TaskProducer implements Runnable {

    private final String name;

    private final TaskQueue taskQueue;



    public TaskProducer(String name, TaskQueue taskQueue) {
        this.name = name;
        this.taskQueue = taskQueue;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                Task task = new Task(name + "-Task");
                taskQueue.addTask(task);
                System.out.println(name + " produziu " + task.getName());
                Thread.sleep(5000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}