package Polymorphism;

public class Base {
    private int value;

    public Base(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void foo() {
        System.err.println("Base is called");
    }
    
}
