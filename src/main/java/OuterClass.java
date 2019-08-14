public class OuterClass {
    private InnerClass mInnerClass;

    public OuterClass() {
        mInnerClass = new InnerClass(this);
        mInnerClass.apply();
    }

    public void print() {
        System.out.println("print in OuterClass");
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
    }
}
