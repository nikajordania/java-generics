import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListObjectMappingExample {
    public static void main(String[] args) {
        try {
            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student("John", 20, "Computer Science"));
            studentList.add(new Student("Alice", 21, "Mathematics"));

            FileOutputStream fileOut = new FileOutputStream("studentList.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(studentList);
            out.close();
            fileOut.close();
            System.out.println("Serialized list is saved in studentList.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ListDeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("studentList.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List<Student> studentList = (List<Student>) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Student List:");
            for (Student student : studentList) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Department: " + student.getDepartment());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}