package de.neuefische.springboot.studentservice;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

    @Service
    public class StudentService {


        private List<Student> students = new ArrayList<>();

        public List<Student> getStudent(){
            return students;
        }

        public Student addStudents(@RequestBody Student student) {
            students.add(student);
            return student;
        }

        public Student getId(String id) {
            for (Student s : students) {
                if (s.getId().equals(id))
                    return s;
            }
            return null;
        }

        public List<Student> getStudents() {
            return students;
        }


}
