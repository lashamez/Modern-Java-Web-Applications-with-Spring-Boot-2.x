package org.packt.springboot22.vid04.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Data
@Entity
@Table(name = "basket")
public class Basket {
	
	@Id
	private Long id;
	private Long userid;
	private Long hid;
	private Integer qty;
	private LocalDate purchasedDate;
	private String approvedBy;
	private LocalDate approvedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", insertable = false,  updatable = false)
	@Fetch(FetchMode.JOIN)
	private Login login;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hid", insertable = false,  updatable = false)
	@Fetch(FetchMode.JOIN)
	private Harvest harvest;

}
