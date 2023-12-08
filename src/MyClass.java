public class MyClass {

    @MethodInfo(author = "John Doe", version = 2, description = "Sample method")
    public void myAnnotatedMethod() {
        // Method implementation
    }

    public void nonAnnotatedMethod() {
        // Method implementation
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MyClass myClass = new MyClass();

        // Retrieve and inspect annotations using reflection
        try {
            MethodInfo annotation = MyClass.class.getMethod("myAnnotatedMethod").getAnnotation(MethodInfo.class);

            System.out.println("Author: " + annotation.author());
            System.out.println("Version: " + annotation.version());
            System.out.println("Description: " + annotation.description());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
