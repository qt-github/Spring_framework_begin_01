package vn.edu.iuh.fit.spring_framework_begin_01.models;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private List<Address> addresses;
    private List<String> emails;

}
