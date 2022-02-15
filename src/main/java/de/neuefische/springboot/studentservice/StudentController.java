package de.neuefische.springboot.studentservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/students")
    public class StudentController {

        private final StudentService studentService;

        public StudentController(StudentService studentService) {
            this.studentService = studentService;
        }


        @GetMapping("/{id}")
        public Student getThisStudent(@PathVariable String id) {
            return studentService.getId(id);
        }

        @PostMapping
        public Student addStudent(@RequestBody Student student) {
            return studentService.addStudents(student);
        }

        @GetMapping()
        public List<Student> allStudent() {
            return studentService.getStudents();
        }
    }

