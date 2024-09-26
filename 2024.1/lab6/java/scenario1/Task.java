public class Task {
    
    private final long creationTime; 
    
    private final String name;

    private final int priority;

    public Task(String name, int priority) {
        this.creationTime = System.currentTimeMillis();
        this.name = name;
        this.priority = priority;
    }
    
    public long getCreationTime() {
        return creationTime;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPriority() {
        return priority;
    }
}
