package com.practice_Problem;


interface SampleInterface {
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements ChildSampleInterface{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }
    @Override
    public void meth2() {
        System.out.println("meth2");
    }
    @Override
    public void meth3() {
        System.out.println("meth3");
    }
    @Override
    public void meth4() {
        System.out.println("meth4");
    }

}
public class Interface_Inheritance_Practice {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }
}
