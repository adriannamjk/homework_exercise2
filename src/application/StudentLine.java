package application;

import java.util.ArrayList;

public class StudentLine{
    private String name;
    private String surname;
    private ArrayList<Double> grades;

    public StudentLine(String name, String surname, ArrayList <Double> grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public void display() {
        System.out.println(this.name + " " + this.surname + "\n" + "Grades: ");
        for (int i=0;i<this.grades.size(); i++){
            if (i==this.grades.size()-1) {
                System.out.print(this.grades.get(i).toString());
                System.out.println();
                System.out.println("=======================================");
            } else {
                System.out.print(this.grades.get(i).toString() + "; ");
            }
        }
    }
}




