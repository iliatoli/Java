package assignment;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            Student temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", "123 Street"));
        students.add(new Student(2, "Bob", "456 Avenue"));
        students.add(new Student(1, "Charlie", "789 Road"));
        students.add(new Student(5, "David", "1010 Lane"));
        students.add(new Student(4, "Emma", "111 Building"));
        students.add(new Student(7, "Frank", "1212 Tower"));
        students.add(new Student(6, "Grace", "1313 House"));
        students.add(new Student(9, "Hank", "1414 Apartment"));
        students.add(new Student(8, "Isabella", "1515 Condo"));
        students.add(new Student(10, "Jack", "1616 Villa"));

        System.out.println("Original order:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSorting by name:");
        SelectionSort.selectionSort(students, new StudentNameComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSorting by roll number:");
        SelectionSort.selectionSort(students, new StudentRollNoComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
