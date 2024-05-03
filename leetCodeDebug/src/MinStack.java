import java.util.ArrayList;
import java.util.List;

class MinStack {
    private  int min;
    List<Integer> list;
    public MinStack() {

        list=new ArrayList<>();

    }

    public void push(int val) {
        list.add(val);

    }

    public void pop() {

        list.remove(list.size()-1);
    }

    public int top() {

       return  list.get(list.size()-1);
    }

    public int getMin() {
        min=Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            min=Math.min(list.get(i),min);
        }
    return min;}
}

