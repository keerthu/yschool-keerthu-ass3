/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment3_keerthu.ManageBean;

import com.mycompany.assignment3_keerthu.Model.Student;
import com.mycompany.assignment3_keerthu.Model.StudentDB;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author keerthu
 */
@ManagedBean
@RequestScoped
public class useManagedBean {

    private Student searchedStudent;
    private List<Student> students;
    private String stname;
    private String stgrade;
    /**
     * Creates a new instance of useManagedBean
     */
    public useManagedBean() {
        students=StudentDB.getStudents();
          
          searchedStudent=new Student();
          stname=searchedStudent.getName();
          stgrade=searchedStudent.getGrade();
    }

    /**
     * @return the searchedStudent
     */
    public Student getSearchedStudent() {
        return searchedStudent;
    }

    /**
     * @param searchedStudent the searchedStudent to set
     */
    public void setSearchedStudent(Student searchedStudent) {
        this.searchedStudent = searchedStudent;
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * @return the stname
     */
    public String getStname() {
        return stname;
    }

    /**
     * @param stname the stname to set
     */
    public void setStname(String stname) {
        this.stname = stname;
    }

    /**
     * @return the stgrade
     */
    public String getStgrade() {
        return stgrade;
    }

    /**
     * @param stgrade the stgrade to set
     */
    public void setStgrade(String stgrade) {
        this.stgrade = stgrade;
    }
    
    public void Search(){        
        StudentDB ss=new StudentDB();
        searchedStudent=ss.searchStudent(stname,stgrade);       
   }
    public String response(){
        if(searchedStudent==null)
        {
            return "emptyStudent";
        }
        else{
            return "view";
        }
    }
}
