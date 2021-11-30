class Queue{
    int front, rear;
    int capacity, size;
    int[] arr;

    public Queue(int capacity){
        this.capacity = capacity;
        front = rear = -1;
        size = 0;
        this.arr = new int[this.capacity];
    }
    boolean isEmpty(){
        return (rear == -1 ? true: false);
    }
    boolean isFull(){
        return (this.size == this.capacity ? true: false);
    }
    int getRear(){
        return rear;
    }
    int getFront(){
        return front;
    }
    void enqueue(int el){
        if(isEmpty()){
            front++;
            rear++;
            arr[rear] = el;
        }else{
            if(rear == capacity - 1 && front == 0){
                System.out.println("Queue full!");
            }else if(rear == capacity - 1 && front != 0){
                rear = 0;
                arr[rear] = el;
            }else if(front > rear){
                if(front - rear == 1){
                    System.out.println("Queue full!");
                }else{
                    arr[++rear] = el;
                }
            }else{
                arr[++rear] = el;
            }
        }
    }
    void print(){
        if(isEmpty()){
            System.out.println("Queue Empty!");
            return;
        }
        else {
            if(front < rear){
                for(int i = front; i <= rear; i++){
                    System.out.println(arr[i]+" <- ");
                }
            }else{
                for(int i = front; i <= capacity-1; i++){
                    System.out.println(arr[i]+" <- ");
                }
                for(int i = 0; i <= rear; i++){
                    System.out.println(arr[i]+" <- ");
                }
            }
            
        }
        
    }
}
public class QueueImplementation{
    public static void main(String[] args){
        Queue q = new Queue(10);
        for(int i = 0; i < 10; i++){
            q.enqueue(i*i*i);
        }
        q.print(); 
        //this line is temporarily added
    }
}