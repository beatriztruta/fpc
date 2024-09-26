public class ScenarioBase {

    public static void main(String[] args) {
        TaskQueue taskQueue = new TaskQueue();

            
        for (int i = 1; i <= 5; i++) {
            new Thread(new TaskProducer("Producer" + i, taskQueue)).start();
        }

    
        for (int i = 1; i <= 3; i++) {
            new Thread(new Node(taskQueue)).start();
        }
    }
}
