import java.util.ArrayList;
import java.util.List;
;public class TodoList {
	private List<TodoListItem> list = new ArrayList<>();
    /*
     * Add a new item to the list, given a description and priority.
     */
    public void addItem(String description, int priority) {
    	TodoListItem item = new TodoListItem(description, priority);
    	list.add(item);
        // TODO
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        // TODO
    	return list.get(i);
        //return null;
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
    	return list.size();
        // TODO
        //return 0;
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
    	// TODO

    	for (TodoListItem item : list) {
    		if (item.isDone() == false) {
    			return item;
    		}
    	}

       return null;
    }
    
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        TodoListItem highestPriority = new TodoListItem(null, 0);

        for (TodoListItem item : list) {
            if (item.getPriority() > highestPriority.getPriority()  && item.isDone() == false) {
                highestPriority = item;

            }

        }


        if (highestPriority.getPriority() != 0 ) {
            return highestPriority;
        }
        else {
            return null;
        }

    }
    public List<String> search(String text) {

        List<String> a1 = new ArrayList<>();

        for(TodoListItem item : list) {
            if (item.getDescription().toLowerCase().contains(text.toLowerCase())){
                a1.add(item.getDescription());
            }


        }



        return a1;
    }
}
