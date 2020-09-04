package br.com.wagnerlima85.unittest.resource.complex;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.wagnerlima85.unittest.resource.complex.validation.ResourceValid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ResourceValid
@JsonInclude(Include.NON_NULL)
public class ComplexResource {

	private Long id;
	private String description;
	private Long value;
	private boolean actived;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="America/Sao_Paulo")
	private Date createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="America/Sao_Paulo")
	private Date updatedAt;
}
