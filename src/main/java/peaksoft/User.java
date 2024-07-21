package peaksoft;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private String name;
    private String lastName;
    private int age;
    private String email;
}
