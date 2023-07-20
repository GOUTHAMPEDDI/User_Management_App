package com.GouthamPeddi.userManagementSystem.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull
    private Integer userId;

    @NotBlank(message = "name cannot be blank")
    private String userName;

    @Email(message = "email should be valid")
    private String userEmail;

    @Pattern(regexp = "^(?=.*[!@#$%^&*()\\[\\]{};':\"\\\\|,.<>/?])(?=.*\\d)(?=.*[A-Z]).{6,}$")
    private String password;

    @Size(min = 7,max = 10)
    @Pattern(regexp = "^[0-9]+$")
    private String userContact;

    @Min(value=18)
    @Max(value=30)
    private Integer userAge;

    @NotNull
    private LocalDate userDOB;

    private Type userType;


}
