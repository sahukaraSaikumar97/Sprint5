package com.marks;

public class StudentMarks {
    public int calculateMarks(int math,int physics,int chemistry,int biology){
        int sum =0;
        sum=math+physics+chemistry+biology;
        return sum;
    }
    public int calculateMarks(int math,int physics,int chemistry){
        int sum =0;
        sum=math+physics+chemistry;
        return sum;
    }
    public double calculateMarks(double businessStudies,double finance,double accounting){
        double sum =0;
        sum=businessStudies+finance+accounting;
        return sum;
    }

}
