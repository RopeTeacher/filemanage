package com.ztx.entity;

/**
 * @Author rope
 * @Date 2020/7/26 20:24
 * @Version 1.0
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class User {
    private Integer id;
    private String username;
    private String password;
}