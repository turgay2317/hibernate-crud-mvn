package org.turgay2317.school;

import java.util.List;

import org.turgay2317.school.dao.StudentDAO;
import org.turgay2317.school.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        StudentDAO dao = new StudentDAO();
        
        Student hero = new Student(216,"Thomaz", "Anderson");
        /* ADD */
        /* hero is added successfully */
        dao.save(hero);
        
        /* UPDATE */
        /* oops, his name is wrong. we must fix him. */
        hero.setStudentName("Thomas");
        dao.update(hero);
        
        /* ADD ONE MORE */
        Student queen = new Student(217,"Trinity", "Matrix");
        dao.save(queen);
        
        /* DELETE */
        /* oh no, she died we must delete */
        dao.delete(queen);
        
        /* LIST */
        /* Who lives?? */
        List<Student> myLittleStudents = dao.list();
        
        for(Student littleSon : myLittleStudents) {
        	System.out.println(littleSon.toString());
        }
        
        
    }
}
