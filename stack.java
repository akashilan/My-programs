
class Stack{
    final int SIZE = 10;
    int[] arr = new int[SIZE];
    int top = -1;
    
    //Retruns the top most value in the Stack.
    int peek(){
        if(top == -1){
            return top;
        }
        return arr[top];
    }

    //Returns the top most value in the Stack and deletes it from the Stack.
    int pop(){
        if(top == -1){
            return top;
        }
        return arr[top--];
        
    }

    //Adds a value to the top of the Stack.
    void push(int el){
        if(top == SIZE - 1){
            System.out.println("Stack overflow!");
        }
        arr[++top] = el;
    }

    //Prints the Stack values.
    void print(){
        if(top == -1){
            System.out.println("Stack empty!");
            return;
        }
        for(int i = 0; i <= top; i++){
            System.out.println(this.arr[i]);
        }
    }

    //Returns the size of the Stack.
    int size(){
        return top + 1;
    }
    
    //Returns true if the stack is Full. Otherwise, false.
    boolean isStackFull(){
        return (top+1 == SIZE ? true: false);
    }
    
    //Returns true if the stack is Empty. Otherwise, false.
    boolean isStackEmpty(){
        return (top == -1? true: false);
    }
    //Inserts a value at a particular index.
    void insert(int index, int el){
        if(isStackFull()){
            System.out.println("Stack is FULL! cannot be inserted...");
            return;
        }else if(isStackEmpty()){
            if(index == 0){
                arr[++top] = el;
                System.out.println("Inserted at index 0");
                return;
            }
            System.out.println("Stack is EMPTY! cannot be inserted except if the index = 0");
        }
        else{
            if(index <=0 || index >SIZE - 1){
                System.out.println("Index out of range!");
            }else if(index > top){
                System.out.println("Element cannot be inserted beyond top!");
            }
            else{
                int i;
                for( i = top; i >= index; i--){
                    arr[i+1] = arr[i];
                }
                arr[++i] = el;
                System.out.println("Inserted at index "+index);
            }
        }
        
    }

    //Sets a value at a given index.
    void set(int index, int el){
        if(top == -1){
            if(index == 0){
                arr[++top] = el;
                System.out.println("Element set at index "+ index);
                return;
            }if(index < 0){
                System.out.println("index is less than 0!\nEnter a non negative index");
            }
            System.out.println("Element cannot be added since stack is empty...use push() to add Element");
            return;
        }else{
            if(index >= 0){
                if(index <= top){
                    arr[index] = el;
                    System.out.println("Element set at index "+ index);
                    return;
                }
                System.out.println("Trying to set the Element beyond top index");
                return;
            }
            System.out.println("Index is less than 0 or greater than the size of the stack");
        }
    }
}
public class Main
{
	public static void main(String[] args) {

		Stack stack = new Stack();

        for(int i = 0; i < 9; i++){
            stack.push(i+1);
        }
	}
}
