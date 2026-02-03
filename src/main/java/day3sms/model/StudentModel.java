package day3sms.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="students")
public class StudentModel {
    @Id
    private String id;

    @NotBlank(message="name cannot be blank")
    private String name;
    private int age;
    @Email(message="email id should be valid")
    @NotBlank(message="email cannot be empty")
    private String email;
}

