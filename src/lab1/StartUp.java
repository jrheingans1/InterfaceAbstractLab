/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author James
 */
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourses introCourse = new IntroToProgrammingCourse("Intro to Programming", "152-107");
        ProgrammingCourses JavaCourse = new IntroJavaCourse("Java Programming", "152-134", "Intro to Programming");
        ProgrammingCourses AdvancedJava = new AdvancedJavaCourse("Advanced Java", "152-135", "Java Programming");
        
        //not sure what to do beyond this point
    }
}
