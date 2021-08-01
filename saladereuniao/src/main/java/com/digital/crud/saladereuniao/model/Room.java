package com.digital.crud.saladereuniao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "meetingroom")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty
	@Column(name = "name", nullable = false)
	private String name;

	@NotEmpty
	@Column(name = "date", nullable = false)
	private String date;

	@NotEmpty
	@Column(name = "startHour", nullable = false)
	private String startHour;

	@NotEmpty
	@Column(name = "endHour", nullable = false)
	private String endHour;

}
