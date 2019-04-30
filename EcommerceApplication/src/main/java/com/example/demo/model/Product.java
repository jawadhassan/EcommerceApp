package com.example.demo.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Product name is required")
	@Basic(optional = false)
	private String name;

	private Double price;

	private String prictureUrl;

	public Product(Long id, @NotNull(message = "Product name is required") String name, Double price,
			String prictureUrl) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.prictureUrl = prictureUrl;
	}

	public Product() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPrictureUrl() {
		return prictureUrl;
	}

	public void setPrictureUrl(String prictureUrl) {
		this.prictureUrl = prictureUrl;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", prictureUrl=" + prictureUrl + "]";
	}

}
