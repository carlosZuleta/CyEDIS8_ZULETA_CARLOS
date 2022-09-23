package Main;


public class Main {
    public static void main(String[] args) {







    }
    public interface IQueue<T>{
        public void enqueue(T element);
        public T dequeue();
        public T front();
        public boolean isEmpty();

    }
}
