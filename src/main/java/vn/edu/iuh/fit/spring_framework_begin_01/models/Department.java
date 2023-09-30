package vn.edu.iuh.fit.spring_framework_begin_01.models;

import lombok.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Department {
    private String d_name;
    private Faculty faculty;
}
