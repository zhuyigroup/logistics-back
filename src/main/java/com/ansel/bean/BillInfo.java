package com.ansel.bean;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


/**
 * @author chenshuai
 * @version 1.0
 * @description 4.2 单据明细表
 * @date 2019/3/17 0017 16:09
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "billinfo")
public class BillInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    private String billType;

    @Column(length = 50)
    private String billCode;

    @Column(length = 50)
    private String billState;

    private Date writeDate;

    @Column(length = 50)
    private String acceptStation;


}
