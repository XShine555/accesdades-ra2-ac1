package com.accesdades.ra2.ac1.accesdades_ra2_ac1.repository;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.accesdades.ra2.ac1.accesdades_ra2_ac1.models.Student;

@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final class CustomRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws java.sql.SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setNom(rs.getString("nom"));
            student.setAge(rs.getInt("age"));
            return student;
        }
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, new CustomRowMapper());
    }

    public int save() {
        String sql = "INSERT INTO student (name, age) VALUES (?, ?)";
        int numReg = jdbcTemplate.update(sql, "Iker", 19);
        return numReg;
    }
}
