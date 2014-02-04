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
public abstract class ProgrammingCourses {

    private int classCapacity;
    private int totalPointsPossible;

    public abstract String getInstructorName();

    public int getClassCapacity() {
        return classCapacity;
    }

    public void setClassCapacity(int classCapacity) {
        this.classCapacity = classCapacity;
    }

    public int getTotalPointsPossible() {
        return totalPointsPossible;
    }

    public void setTotalPointsPossible(int totalPointsPossible) {
        this.totalPointsPossible = totalPointsPossible;
    }

}
