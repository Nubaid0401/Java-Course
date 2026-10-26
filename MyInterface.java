interface MyInterface1 {
    public void method1();
    public void method2();
}

class MyInterface implements MyInterface1 {
    public void method1() {
        System.out.println("Implementation of method 1");
    }
    public void method2() {
        System.out.println("Implementation of method 2");
    }
    public static void main(String[] arg) {
        MyInterface1 obj = new MyInterface();
        obj.method1();
        obj.method2();
    }
}
