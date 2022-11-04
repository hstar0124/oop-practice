package org.example.grade;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {

        // 학점수 * 교과목 합계
        double multipliedCreditAndCourseGrade =  courses.multiplyCreditAndCourseGrade();

        // 수강 신청 총학점 수
        int totalCompletedCredit = courses.calculateToTotalCompletedCredit();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
