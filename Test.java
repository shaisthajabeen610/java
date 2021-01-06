
public class Test{
        public void main(String args[]) {
            Test1 t1 = new Test1();
            t1.two(10,20);
            t1.two(500,200,30);
           /* System.out.println(Methodoverloading.two(10,20));
            System.out.println(Methodoverloading.two(10,20,30));*/

        }
    }
    class Test1 {
    int two(int a, int b) {
        return a+b;
    }
    int two(int s, int r, int c) {
        return s+r+c;
    }

}




