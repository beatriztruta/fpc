public class Node implements Runnable {

  private final TaskQueue taskQueue;

  public Node(TaskQueue taskQueue) {
    this.taskQueue = taskQueue;
  }

  @Override
  public void run() {
    try {
        while (true) {
            Task task = taskQueue.getTask();
            if (task != null) {
                long processingTime = System.currentTimeMillis() - task.getCreationTime();
                System.out.println("Processando " + task.getName() + " - Tempo de vida: " + processingTime + "ms");
            }
            Thread.sleep(1000); 
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }
}
