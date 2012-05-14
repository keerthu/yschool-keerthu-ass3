/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment3_keerthu.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author keerthu
 */
public class StudentDB {
    private final static List<Student> students;

    static {

        Student abi = new Student("abi", "1", "Suba", "Male", "6");
        Student shara = new Student("shara", "3", "Nava", "Female", "8");
        Student nisha = new Student("nisha", "1", "Mahen", "Female", "6");
        Student thinesh = new Student("thinesh", "5", "Maha", "Male", "10");
        Student rubi = new Student("rubi", "4", "Siva", "Female", "9");

        students = new ArrayList<Student>();
        getStudents().add(abi);
        getStudents().add(shara);
        getStudents().add(nisha);
        getStudents().add(thinesh);
        getStudents().add(rubi);

    }

    /**
     * @return the students
     */
    public static List<Student> getStudents() {
        return students;
    }
    public Student searchStudent(String name, String grade) {

        Student s = null;
        for (int i = 0; i < getStudents().size(); i++) {
            if (getStudents().get(i).getName().equals(name) && getStudents().get(i).getGrade().equals(grade)) {
                s = getStudents().get(i);
            }

        }
        return s;

    }

    
}
