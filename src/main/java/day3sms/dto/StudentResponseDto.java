package day3sms.dto;

public record StudentResponseDto<name, age, email>(
    String id,
    String name,
    int age,
    String email
){

}
