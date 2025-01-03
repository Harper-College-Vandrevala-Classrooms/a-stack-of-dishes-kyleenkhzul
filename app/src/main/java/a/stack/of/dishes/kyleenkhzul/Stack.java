/*
 * This source file was generated by the Gradle 'init' task
 */
package a.stack.of.dishes.kyleenkhzul;

class Dish {
    public String description;

    Dish(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

class DishStack {
    private Dish[] stack;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a maximum size
    public DishStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new Dish[maxSize];
        top = -1; // Indicates the stack is empty
    }

    // Push a Dish object onto the stack
    public void push(Dish dish) {
        if (isFull()) {
            System.out.println("The stack is full. Cannot push more dishes.");
        } else {
            stack[++top] = dish;
        }
    }

    // Pop a Dish object from the stack
    public Dish pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty. Cannot pop any dishes.");
            return null;
        } else {
            return stack[top--];
        }
    }

    // Peek at the top Dish object without removing it
    public Dish peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty. Nothing to peek.");
            return null;
        } else {
            return stack[top];
        }
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is full
    private boolean isFull() {
        return top == maxSize - 1;
    }

    // Check if the stack is empty
    private boolean isEmpty() {
        return top == -1;
    }
}
