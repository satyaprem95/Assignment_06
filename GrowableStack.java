package Assignment6P1;
import java.util.ArrayList;

public class GrowableStack implements  IntStack{
    private ArrayList<Integer> stack;

    public GrowableStack(int capacity)
    {
        stack = new ArrayList<>(5);
    }

    @Override
    public void push(int num) {
            stack.add(num);
    }

    @Override
    public int pop() {
        if (isUnderflow())
        {
            return -1;
        }
        int poppedElement = stack.getLast();
        stack.removeLast();
        return poppedElement;
    }

    @Override
    public boolean isUnderflow() {
        return stack.isEmpty();
    }

    @Override
    public boolean isOverflow() {
        return false;
    }

    @Override
    public void printStack()
    {
        System.out.print("\nStack: ");
        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }

        System.out.print("\nLength of Stack: "+stack.size());
    }
}