/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author James
 */
public class Startup {

    public static void main(String[] args) {
        /*
         Liskovs substitution principal can be used here to make the  instansiation 
         abstract, i believe only in concrete classes is it not possible. Furthermore,
         this architecture is extremely useful in that if i have to add to this
         program it wont break easily if at all.
         */
        ProgrammingCourses introCourse = new IntroToProgrammingCourse("Intro to Programming", "152-107", 4.0);
        ProgrammingCourses javaCourse = new IntroJavaCourse("Java Programming", "152-134", 4.0, "Intro to Programming");
        ProgrammingCourses advancedJava = new AdvancedJavaCourse("Advanced Java", "152-135", 4.0, "Java Programming");

        System.out.println(introCourse);
        System.out.println(javaCourse);
        System.out.println(advancedJava);
    }
}
