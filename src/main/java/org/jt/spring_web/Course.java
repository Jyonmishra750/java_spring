package org.jt.spring_web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Course {
    private int slno;
    private String coursename;
    private String duration;
    private String fee;
}
