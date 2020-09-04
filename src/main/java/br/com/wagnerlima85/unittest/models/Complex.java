package br.com.wagnerlima85.unittest.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "complex")
public class Complex implements Serializable {

	private static final long serialVersionUID = -4850734180036049820L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 255)
	private String description;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "actived", columnDefinition = "BIT", length = 1)
	private boolean actived;
	
	private Long value;
	
//	@OneToOne(fetch = FetchType.EAGER)
//	@JoinTable(
//			name="moderate",
//			joinColumns={@JoinColumn(name="moderate_id", referencedColumnName="id",insertable=false, updatable=false)},
//			inverseJoinColumns={@JoinColumn(name="moderate_id", referencedColumnName="id",insertable=false, updatable=false)})
//	private Moderate moderate;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Complex )) return false;
		return this.getId() != null && this.getId().equals(((Complex) o).getId());
	}
	
	@PreUpdate
	public void updateTimeStamps() {
		updatedAt = LocalDateTime.now();
	}

	@PrePersist
	public void persistTimeStamps() {
		createdAt = LocalDateTime.now();
	}
	 
    @Override
    public int hashCode() {
        return 1;
    }

}
