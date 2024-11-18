/*
 * This source file was generated by the Gradle 'init' task
 */
package a.stack.of.dishes.kyleenkhzul;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DishStackTest {
    private DishStack stack;
    private Dish oneDish;
    private Dish twoDish;
    private Dish redDish;
    private Dish blueDish;

    @BeforeEach
    void setUp() {
        stack = new DishStack(3); // Initialize stack with a maximum size of 3
        oneDish = new Dish("A dish with one fish pattern on it");
        twoDish = new Dish("A dish with two fish patterns on it");
        redDish = new Dish("A dish with a red fish pattern on it");
        blueDish = new Dish("A dish with a blue fish pattern on it");
    }

    @Test
    void testInitialStackSize() {
        assertEquals(0, stack.size());
    }

    @Test
    void testPushAndSize() {
        stack.push(oneDish);
        stack.push(twoDish);
        assertEquals(2, stack.size());

        stack.push(redDish);
        assertEquals(3, stack.size());
    }

    @Test
    void testPushWhenStackIsFull() {
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        
        // Try to push another dish when the stack is full
        stack.push(blueDish);
        
        // Ensure the stack size remains unchanged
        assertEquals(3, stack.size());
    }

    @Test
    void testPop() {
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);

        // Pop the top element (should be redDish)
        Dish poppedDish = stack.pop();
        assertEquals(redDish.description, poppedDish.description);

        // Pop another element (should be twoDish)
        Dish anotherPoppedDish = stack.pop();
        assertEquals(twoDish.description, anotherPoppedDish.description);

        assertEquals(1, stack.size());
    }

    @Test
    void testPopWhenStackIsEmpty() {
        Dish poppedDish = stack.pop();
        assertNull(poppedDish); // Expect null since the stack is empty
    }

    @Test
    void testPeek() {
        stack.push(oneDish);
        stack.push(twoDish);

        // Peek at the top element (should be twoDish)
        Dish peekedDish = stack.peek();
        assertEquals(twoDish.description, peekedDish.description);

        // Ensure the size remains unchanged after peeking
        assertEquals(2, stack.size());
    }

    @Test
    void testPeekWhenStackIsEmpty() {
        Dish peekedDish = stack.peek();
        assertNull(peekedDish); // Expect null since the stack is empty
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.size() == 0);
        stack.push(oneDish);
        assertFalse(stack.size() == 0);
    }

    @Test
    void testIsFull() {
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        
        // Check if the stack is considered full
        assertEquals(3, stack.size()); // Maximum size reached
    }
}

