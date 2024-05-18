public class MyAnnotationUsageExample {
    public static void main(String[] args) throws NoSuchMethodException {
        MyMethod obj = new MyMethod();

        MyAnnotation annotation = obj.getClass().getDeclaredMethod("myMethod").getAnnotation(MyAnnotation.class);
        if (annotation != null) {
            String value = annotation.value();
            System.out.println("Value: " + value);

        }
        obj.myMethod();
    }
}
