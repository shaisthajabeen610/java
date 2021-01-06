 class Parent{
    void say(){
        System.out.println("child has to obey parents orders");
    }

}
class Child extends Parent{
    @Override
    void say(){
        System.out.println("i am happy");
    }

}


class Method_Overriding {
    public static void main(String[] args) {
        Parent obj1=new Parent();
        Parent obj2=new Child();
        obj1.say();
        obj2.say();
    }
}
