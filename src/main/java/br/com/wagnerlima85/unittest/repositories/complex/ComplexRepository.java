package br.com.wagnerlima85.unittest.repositories.complex;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wagnerlima85.unittest.models.Complex;

@Repository
public interface ComplexRepository extends JpaRepository<Complex, Long>  {
	Optional<Complex> findById(Long id);
	List<Complex> findAll();
}
