abstract class college{
    abstract int students();
    abstract void cash();
}
 public class Sample_Abstract extends college{
    int students(int x,int y){
        return x;
    }
    void cash(){
        System.out.print("every day a huge amount transaction is done");
    }
    public  void main(String[] args) {
        Sample_Abstract obj1=new Sample_Abstract();
        obj1.students(100,20);
        obj1.cash();
    }
}
