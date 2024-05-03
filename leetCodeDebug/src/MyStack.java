import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {
    private Deque<Integer> deque;

    public MyStack() {
        deque = new ArrayDeque<>();
    }

    public void push(int x) {
        deque.addLast(x);
    }

    public int pop() {
    return deque.removeLast();
    }

    public int top() {
  return deque.peekLast();
    }

    public boolean empty() {
return deque.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */