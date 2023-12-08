https://jenkov.com/tutorials/java/enums.html

https://jenkov.com/tutorials/java/record.html

https://jenkov.com/tutorials/java/lambda-expressions.html

https://jenkov.com/tutorials/java-collections/streams.html



### Example Practical Task 1

```java
enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("It's the beginning of the week.");
                break;
            case WEDNESDAY:
                System.out.println("It's the middle of the week.");
                break;
            case FRIDAY:
                System.out.println("It's almost the weekend.");
                break;
            default:
                System.out.println("It's just another day.");
        }

        System.out.println("Days of the week:");
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day);
        }
    }
}


```

1. **Enhance Enum with Information:**
   
   - Add information to the Enum values, such as a day's full name or abbreviation.
   - Modify the `DaysOfWeek` Enum to include additional attributes like `fullName` or `abbreviation` for each day.

2. **Implement Enum Methods:**
   
   - Add methods to the Enum to perform specific actions or retrieve information.
   - For example, add a method to get the next day or check if a given day is a weekday or weekend.

3. **User Input Handling:**
   
   - Modify the program to take user input for the current day and perform actions based on the user's input.
   - Ensure the input is case-insensitive and handle invalid input gracefully.

4. **Enum in a Switch Statement:**
   
   - Create a separate method that accepts an Enum value and uses a switch statement to perform different actions based on the day.
   - Call this method with different Enum values to demonstrate the switch statement.

5. **Enum in a Collection:**
   
   - Create a collection an ArrayList to store Enum values.
   - Implement a method to filter and display only weekdays or weekends from the collection.



### Example Practical Task 2



1. **Task 1: Print Numbers**
   
   - Write a Java program that creates a list of integers.
   - Utilize the Stream API to print all the numbers in the list.

2. **Task 2: Filter and Print Evens**
   
   - Extend your program to filter out and print only the even numbers from the list using the Stream API.

3. **Task 3: Calculate and Print Sum**
   
   - Calculate and print the sum of all numbers in the list using the Stream API.

4. **Task 4: Transform and Print Squares**
   
   - Enhance your program to transform each number in the list into its square and print the resulting list using the Stream API.

5. **Task 5: Find and Print Max Value**
   
   - Extend your program to find and print the maximum value in the list using the Stream API.



### Example Practical Task 3

**Serialization** Implement serialization and deserialization for the `Person` record using the `Serializable` interface. Save instances of `Person` to a file, and then read and display the information from that file.


