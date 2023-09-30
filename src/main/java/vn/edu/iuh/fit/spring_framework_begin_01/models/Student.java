package vn.edu.iuh.fit.spring_framework_begin_01.models;

import lombok.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private Clazz clazz;
}
