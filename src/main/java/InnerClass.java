public class InnerClass {
    private OuterClass mOuterClass;

    public InnerClass(OuterClass outerClass) {
        mOuterClass = outerClass;
    }

    public void apply() {
        mOuterClass.print();
    }
}
