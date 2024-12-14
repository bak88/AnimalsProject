public class Counter implements AutoCloseable{

    private int count = 0;
    private boolean closed = false;

    public void add(){
        if(closed){
            throw new IllegalStateException("Resourse is closed");
        }
    }

    @Override
    public void close()  {
        closed = true;
    }

    public int getCount(){
        return count;
    }
}
