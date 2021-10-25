public class Square extends Rectangle{
    public Square(int size){
        super(size, size);
    }
    public void setSize(int size){
        setWidth(size);
        setHeight(size);
    }
    public void setWidth(int height){
        super.setHeight(height);
        super.setWidth(height);
    }
}
