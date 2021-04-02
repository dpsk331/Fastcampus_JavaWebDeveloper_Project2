package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity // 이 클래스가 Entity임을 명시
// @Table(name = "user") // 자바 클래스의 이름과 DB 테이블의 이름이 동일하다면 명시할 필요 X, 자동 매칭됨!
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(name = "account") // 위의 @Table 애노테이션과 같이 변수명과 컬럼명이 동일하다면 명시할 필요X, 자동 매칭됨!
    private String account;
    private String email;
    private String phoneNumber;
    private LocalDateTime createAt;
    private String createBy;
    private LocalDateTime updateAt;
    private String updateBy;

}
