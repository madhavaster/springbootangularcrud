package com.agrisutra.util;

import com.agrisutra.model.Student;

public interface StudentUtil {
    public static void calculateDtls(Student student) {
        var stdFee = student.getStdFee();
        var discount = stdFee*10/100.0;
        var gst = stdFee*12/100.0;
        student.setStdFeeDisc(discount);
        student.setStdFeeGst(gst);
    }
}
