package com.uni.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LoaiPhim")
public class LoaiPhim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Malp;
	private String loaiphim;
	
	@ManyToOne
	@JoinColumn(name = "PhimMaphim")
	private Phim phim;
}
