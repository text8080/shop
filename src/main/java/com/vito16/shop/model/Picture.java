package com.vito16.shop.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 图片
 * @author 陈浩
 * @version 2019/10/14
 */
@Data
@Entity
@DynamicUpdate
@Table(name = "t_picture")
public class Picture extends AbstractEntity {

    @Column(columnDefinition="VARCHAR(32) NOT NULL COMMENT '图片名称'")
    private String title;

    @Column(columnDefinition="VARCHAR(128) NOT NULL COMMENT '图片描述'")
    private String memo;

    @Column(columnDefinition="VARCHAR(64) NOT NULL COMMENT '图片地址'")
    private String url;

    @ManyToOne
    @JoinColumn
    private Admin updateAdmin;


}
