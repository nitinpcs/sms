package day3sms.controller;

import com.example.day3sms.dto.StudentRequestDto;
import com.example.day3sms.dto.StudentResponseDto;
import com.example.day3sms.model.StudentModel;
import com.example.day3sms.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    // Create
    @PostMapping
    public StudentResponseDto addStudent(@Valid @RequestBody StudentRequestDto student){
        return service.addStudent(student);
    }

    // Read all
    @GetMapping
    public List<StudentResponseDto> getAllStudents(){
        return service.getAllStudents();
    }

    // Read by id
    @GetMapping("/{id}")
    public StudentModel getStudentById(@PathVariable String id){
        return service.getStudentById(id);
    }

    // Update
    @PutMapping("/{id}")
    public StudentResponseDto updateStudent(@PathVariable String id, @RequestBody StudentRequestDto student){
        return service.updateStudent(id, student);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){
        service.deleteStudent(id);
    }
}

