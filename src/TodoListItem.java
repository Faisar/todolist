import java.util.*;
public class TodoListItem {
	private boolean done = false;
	private String desc;
	private int priority;
	
	public TodoListItem(String s, int n) {
		desc = s;
		this.priority = n;
	}
	
	public String getDescription() {
		return desc;
	}
	public int getPriority() {
		return this.priority;
	}
	public void markDone() {
		this.done = true;
	}
	public boolean isDone() {
		return done;
	}
}
