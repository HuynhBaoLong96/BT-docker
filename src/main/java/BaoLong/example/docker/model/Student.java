package BaoLong.example.docker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hoTen;
    private String maSoSinhVien;

    // Constructor không tham số (bắt buộc)
    public Student() {}

    public Student(String hoTen, String maSoSinhVien) {
        this.hoTen = hoTen;
        this.maSoSinhVien = maSoSinhVien;
    }

    // Getters
    public Long getId() { return id; }
    public String getHoTen() { return hoTen; }
    public String getMaSoSinhVien() { return maSoSinhVien; }
}