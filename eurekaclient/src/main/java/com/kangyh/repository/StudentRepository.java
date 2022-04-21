package com.kangyh.repository;

import com.kangyh.entity.Student;

import java.util.Collection;

/**
 * @ClassName: StudentRepository
 * @Package: com.kangyh.repository
 * @Description:
 * @Datetime: 2022/4/20   17:40
 * @Author: YuHan.Kang@outlook.com
 */
public interface StudentRepository {
    Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);


}
