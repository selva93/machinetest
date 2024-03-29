package com.machinetest.machinetest.model;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@SuppressWarnings("serial")
public class BaseModel implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT")
    private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}  
	
	
}
