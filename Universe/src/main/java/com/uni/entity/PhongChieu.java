package com.uni.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PhongChieu")
public class PhongChieu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Mapc;
	private String Tenpc;
	
	@OneToOne(mappedBy = "phongChieu")
	private Phim phim;
	
}
