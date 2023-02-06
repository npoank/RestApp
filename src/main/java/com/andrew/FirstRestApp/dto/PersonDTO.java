package com.andrew.FirstRestApp.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class PersonDTO {

    @NotEmpty(message = "Name mustn't be empty")
    @Size(min = 1, max = 50, message = "Name must be 1-50 symbols")
    private String name;

    @Min(value = 0, message = "Age must be greater 0")
    private int age;

    @Email
    @NotEmpty(message = "Email mustn't be empty")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
