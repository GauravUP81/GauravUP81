package com.flucent.dao.mapper;




import java.util.List;
import java.util.stream.Collectors;

import com.flucent.bean.Address;
import com.flucent.bean.Student;
import com.flucent.dao.CreateStudentDTO;
import com.flucent.dao.StudentResponseDTO;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StudentMapper {

    public static Student toEntity(CreateStudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setBirthday(dto.getBirthday());

        Address address = new Address();
        address.setZipCode(dto.getZipCode());
        address.setStreet(dto.getStreet());
        address.setNumber(dto.getNumber());
        address.setComplement(dto.getComplement());
        address.setDistrict(dto.getDistrict());
        address.setCity(dto.getCity());
        address.setState(dto.getState());
        address.setStudent(student);

        student.setAddress(address);

        return student;
    }

    public static StudentResponseDTO toDTO(Student student) {
        StudentResponseDTO dto = new StudentResponseDTO();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setBirthday(student.getBirthday());
        dto.setCreatedAt(student.getCreatedAt());
        dto.setZipCode(student.getAddress().getZipCode());
        dto.setStreet(student.getAddress().getStreet());
        dto.setNumber(student.getAddress().getNumber());
        dto.setComplement(student.getAddress().getComplement());
        dto.setDistrict(student.getAddress().getDistrict());
        dto.setCity(student.getAddress().getCity());
        dto.setState(student.getAddress().getState());

        return dto;
    }

    public static List<StudentResponseDTO> toDTO(List<Student> students) {
        return students.stream()
                .map(student -> toDTO(student))
                .collect(Collectors.toList());
    }

}
