import java.util.Deque;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);

    }

    public int pop() {
        while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }

         int x=outStack.pop();

        while (!outStack.empty()){
            inStack.push(outStack.pop());
        }
        return x;
    }

    public int peek() {
        while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }
        int x = outStack.peek();
        while (!outStack.empty()){
            inStack.push(outStack.pop());
        }
        return x;
    }

    public boolean empty() {
    return inStack.empty();
    }
}