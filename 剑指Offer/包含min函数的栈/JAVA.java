import java.util.Stack;

public class Solution {

    static int min;
    Stack<Integer> stack = new Stack<>();

    public void push(int node) {
        if (stack.empty()) {
            min = node;
            stack.push(node - min);
        } else {
            stack.push(node - min);
            if (min > node) {
                min = node;
            }
        }
    }

    public void pop() {
        if (!stack.empty()) {
            int x = stack.pop();
            if (x < 0) {
                min = min - x;
            }
        }
    }

    public int top() {
        if (!stack.empty()) {
            return stack.peek() + min;
        }
        return 0;
    }

    public int min() {
        return min;
    }
}