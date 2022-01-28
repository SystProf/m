/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package StudentList;

/**
 *This class is a model class for parttime students which is extended from student class
 * @author Megha Patel,2022
 */
public class PartTimeStudent extends Student {

    /**
     * @return the numOfCourses
     */
    public int getNumOfCourses() {
        return numOfCourses;
    }

    /**
     * @param numOfCourses the numOfCourses to set
     */
    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    private int numOfCourses;

}
