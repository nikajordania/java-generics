import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();

    int count() default 1;
}

@MyAnnotation(value = "class level example", count = 3)
class MyClassT {


    public void myMethod() {

        System.out.println("Executing myMethod...");
    }

    public static void main(String[] args) {
        MyClassT obj = new MyClassT();


        MyAnnotation annotation = MyClassT.class.getAnnotation(MyAnnotation.class);
        if (annotation != null) {
            String value = annotation.value();
            System.out.println("Value: " + value);
        }

        obj.myMethod();
    }
}