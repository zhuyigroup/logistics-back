package com.ansel.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * 4.37 打印客户运量
 * 
 * @author lenovo
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customeramount")
public class CustomerAmount {

	
	@Id
	@GeneratedValue(generator = "id")
	@GenericGenerator(name = "id", strategy = "assigned")
	@Column(length = 50)
	private String sendGoodsCustomer;// 发货客户
	
	private double carriageTotal;// 运费总计
	
	private double insuranceTotal;// 保险费�?�计
	
	private int pieceAmountTotal;// 件数总计


}
