package com.management.empcourse.controller.form;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class MemberForm {

    private String empid;

    //@Size(min=1, max=100)
    private String name;
    //@NotNull
    private char sex;
    private String phonenum;
    //@Size(min=1, max=100)
    private String address;
    //@NotNull
    //@Min(0)
    private Integer age;

}
