package org.jsp.hospitalmanagement.dto;
	
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



	@Entity
	public class Hospital {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String gst;
		private String funder;
		private String yoe;
		@OneToMany(mappedBy = "hospital")
		private List<Branch> branches;

		public List<Branch> getBranches() {
			return branches;
		}

		public void setBranches(List<Branch> branches) {
			this.branches = branches;
		}

		public int getId() {
			return id;
		}

	

		public void setGst(String gst) {
			this.gst = gst;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGst() {
			return gst;
		}
	}
	
	
	


