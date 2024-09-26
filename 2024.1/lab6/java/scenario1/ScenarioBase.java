public class ScenarioBase {

    public static void main(String[] args) {
        TaskQueue taskQueue = new TaskQueue();

        new Thread(new TaskProducer("Producer1", taskQueue, 0, 13000)).start(); 
        new Thread(new TaskProducer("Producer2", taskQueue, 1, 7000)).start();  
        new Thread(new TaskProducer("Producer3", taskQueue, 2, 3000)).start(); 
    
        for (int i = 1; i <= 3; i++) {
            new Thread(new Node(taskQueue)).start();
        }
    }
}
