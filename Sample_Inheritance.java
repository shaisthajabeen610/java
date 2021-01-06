interface s1{
    void method1();
}
interface s2{
    void method2();
}
class Sample_Inheritance implements s1,s2 {
    public void method1(){
        System.out.println("inheriting  method1() from abstract class s1");
    }
    public void method2(){
        System.out.println("inheriting method2() from abstract class s2");
    }
    public static void main(String[] args) {
        Sample_Inheritance obj2=new Sample_Inheritance();
        obj2.method1();
        obj2.method2();
    }

}
