package DataStructures.queue;

import java.util.Stack;

public class Queue_With_Two_Stacks {

    public static class MyQueue<T> {
        private Stack<T> stackNewestOnTop = new Stack<>();
        private Stack<T> stackOldestOnTop = new Stack<>();


        public void enqueue(T value){ // add item
        stackNewestOnTop.push(value);
        }

        public T peek() { // Get "oldest" item
            // move elements from stackNewestOnTop to stackOldestOnTop
            shiftStacks();
            return stackOldestOnTop.peek();
        }

        private void shiftStacks(){
            if (stackOldestOnTop.isEmpty()) {
                while (!stackNewestOnTop.isEmpty()){
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

        public T dequeue() { // Get "oldest" item and remove it
            // move elements from stackNewestOnTop to stackOldestOnTop
            shiftStacks();
            return stackOldestOnTop.pop();

        }
    }


}
