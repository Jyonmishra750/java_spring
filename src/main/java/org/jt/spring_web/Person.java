package org.jt.spring_web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {
    
    private String name;
    private String qualification;
    private String location;
    private String email;
    private String contact;

    /*
     * boolean isAvailable (This is a local variable)
     * For the above expression the setter and getter method would be:
     * Setter Method - setAvailable();
     * Getter Method - isAvailable();
    */
}
