public class TaskProducer implements Runnable {

    private final String name; 
    
    private final TaskQueue taskQueue; 
    
    private final int priority; 
    
    private final long delay;

    public TaskProducer(String name, TaskQueue taskQueue, int priority, long delay) {
        this.name = name;
        this.taskQueue = taskQueue;
        this.priority = priority;
        this.delay = delay;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                Task task = new Task(name + "-Task", priority);
                taskQueue.addTask(task);
                System.out.println(name + " produziu " + task.getName() + " com prioridade " + priority);
                Thread.sleep(delay); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}