package application;

import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args){
        List<StudentLine> listOfStudents = new ArrayList <>();

        FileReader fileReader = new FileReader();
        ArrayList<StudentLine> student = fileReader.parseFile("students.txt");

        listOfStudents.addAll(student);

        for (StudentLine studentLine : listOfStudents){
            studentLine.display();
        }
    }
}


