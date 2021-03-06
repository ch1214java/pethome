package cn.xinhang.user.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String salt;
    private String password;
    private Integer state = 0;
    private Integer age;
    private Date createtime = new Date();
    private String headImg;
    private Long logininfo_id;

}
