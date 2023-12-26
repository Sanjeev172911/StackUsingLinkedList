public class StackTest {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();

        stack.push(56);
        stack.push(30);
        stack.push(70);

        System.out.println("Top of stack is :"+stack.peak());

        while(!stack.isEmpty()){
            System.out.println("Top of stack is :"+stack.peak());
            stack.pop();
        }
    }
}
