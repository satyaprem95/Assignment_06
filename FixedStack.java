package Assignment6P1;

public class FixedStack implements IntStack{
    private final int[] stack;
    private int top;

    public FixedStack(int capacity)
    {
        stack = new int[capacity];
        top = -1;
    }

    @Override
    public void push(int num) {
        if (isOverflow())
        {
            System.out.println("The Stack is full. Cannot push more elements.");
        }
        else {
            stack[++top] = num;
        }
    }

    @Override
    public int pop() {
        if (isUnderflow())
        {
            System.out.println("The Stack is empty. Cannot pop elements.");
            return -1;
        }
        int poppedElement = stack[top];
        stack[top] = 0;
        top--;
        return poppedElement;
    }

    @Override
    public boolean isUnderflow() {
        return top == -1;
    }

    @Override
    public boolean isOverflow() {
        return stack.length == top + 1;
    }

    @Override
    public void printStack()
    {
        System.out.print("\nStack: ");
        for(int ele: stack)
        {
            System.out.print(ele+" ");
        }
        System.out.println("\nLength of Stack: "+stack.length);
    }
}