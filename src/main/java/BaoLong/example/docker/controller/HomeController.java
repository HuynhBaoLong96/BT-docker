package BaoLong.example.docker.controller;

import BaoLong.example.docker.model.Student;
import BaoLong.example.docker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String index(Model model) {
        // Tự động thêm data vào DB nếu chưa có
        if (studentRepository.count() == 0) {
            studentRepository.save(new Student("Huỳnh Bảo Long", "2280601749"));
        }

        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "index";
    }
}