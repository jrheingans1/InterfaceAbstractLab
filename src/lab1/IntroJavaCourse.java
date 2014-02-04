package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourses {

    private int classCapacity;
    private int totalPointsPossible;

    private String courseName;
    private String courseNumber;
    private double credits;
    private final String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.prerequisites = prerequisites;
    }

    public String getInstructorName() {
        return String.format("Matt Green");
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (!"Intro to Programming".equals(prerequisites)) {
            System.out.println(
                    "Error: you do not meet the prerequisites to take this course");
            System.exit(0);
        }
        this.setPrerequisites(prerequisites);
    }

    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    @Override
    public int getClassCapacity() {
        return classCapacity;
    }

    /**
     *
     * @param classCapacity
     */
    @Override
    public void setClassCapacity(int classCapacity) {
        this.classCapacity = classCapacity;
    }

    /**
     *
     * @return
     */
    @Override
    public int getTotalPointsPossible() {
        return totalPointsPossible;
    }

    /**
     *
     * @param totalPointsPossible
     */
    @Override
    public void setTotalPointsPossible(int totalPointsPossible) {
        this.totalPointsPossible = totalPointsPossible;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
