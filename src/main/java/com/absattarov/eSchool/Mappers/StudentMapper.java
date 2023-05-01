package com.absattarov.eSchool.Mappers;

import com.absattarov.eSchool.models.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.builder.annotation.ProviderMethodResolver;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM Student WHERE id = #{id}")
    Optional<Student> getStudent(@Param("id") Long id);

    @Insert("Insert into Student(firstname,lastname,birthDate,phoneNumber) values (#{firstname},#{lastname},#{birthDate},#{phoneNumber})")
    Integer save(Student student);

    @Update("Update Student set firstname= #{firstname},lastname=#{lastname},birthDate=#{birthDate},phoneNumber=#{phoneNumber} where id=#{id}")
    void updateStudent(Student student);

    @Delete("Delete from Student where id=#{id}")
    void deleteStudentById(Long id);

//    @SelectProvider(StudentSqlProvider.class)
//    List<Student> getStudents();
    @Select("SELECT * FROM STUDENT")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "firstname", column = "firstname"),
            @Result(property = "lastname", column = "lastname"),
            @Result(property = "birthDate", column = "birthDate"),
            @Result(property = "phoneNumber", column = "phoneNumber")
    })
    List<Student> getAllStudents();

}
