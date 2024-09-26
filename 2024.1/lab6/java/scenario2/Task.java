public class Task {
    
    private final long creationTime; 
    
    private final String name;

    public Task(String name) {
        this.creationTime = System.currentTimeMillis();
        this.name = name;
    }
    
    public long getCreationTime() {
        return creationTime;
    }
    
    public String getName() {
        return name;
    }
}
