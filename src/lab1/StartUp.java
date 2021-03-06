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
        /*
         Liskovs substitution principal can be used here to make the  instansiation 
         abstract, i believe only in concrete classes is it not possible. Furthermore,
         this architecture is not as useful as useful interface in that if i have
         to add to this program it could break some things if not all of it.
         */
        ProgrammingCourses introCourse = new IntroToProgrammingCourse("Intro to Programming", "152-107");
        ProgrammingCourses javaCourse = new IntroJavaCourse("Java Programming", "152-134", "Intro to Programming");
        ProgrammingCourses advancedJava = new AdvancedJavaCourse("Advanced Java", "152-135", "Java Programming");

        System.out.println(introCourse);
        System.out.println(javaCourse);
        System.out.println(advancedJava);
    }
}
