/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Yanjun Fang
 */
import java.util.*;
public class StudentList {
    public static void main(String args[]){
        Student[] s = new Student[5];
        Scanner input = new Scanner(System.in);
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//        s1.setName("Yanjun");
//        s2.setName("Amber");
//        System.out.println(s1.getName());
//        System.out.println(s2.getName());
//        
//        studentList[0] = s1;
//        studentList[1] = s2;
        for(int i =0; i<s.length-1; i++)
        {
            s[i] = new Student();
            System.out.println("Enter id: ");
            s[i].setId(input.nextInt());
            System.out.println("id: "+s[i].getId());
        }
        
    }
}
