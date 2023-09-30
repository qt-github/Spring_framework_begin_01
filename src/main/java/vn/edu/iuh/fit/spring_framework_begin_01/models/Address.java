package vn.edu.iuh.fit.spring_framework_begin_01.models;

import lombok.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Address {
    private String city;
    private String country;
    private String street;
}
