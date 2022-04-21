package com.kangyh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Student
 * @Package: com.kangyh.entity
 * @Description:
 * @Datetime: 2022/4/21   16:38
 * @Author: YuHan.Kang@outlook.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private long id;
    private String name;
    private int age;
}
