package br.com.wagnerlima85.unittest;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.wagnerlima85.unittest.models.Complex;
import br.com.wagnerlima85.unittest.repositories.complex.ComplexRepository;

@ExtendWith(SpringExtension.class)
@RunWith(MockitoJUnitRunner.class)
class UnittestApplicationTests {

	@MockBean
	private ComplexRepository complexRepository;
	
	private ComplexRepository repo;
	
	@Autowired
    ApplicationContext context;


	@Test
	void testCreateComplexObject() {

		System.err.println("Insert");
		
		Complex item = new Complex();
		item.setActived(true);
		item.setId(1L);
		item.setValue(10L);
		item.setUpdatedAt(LocalDateTime.now());
		item.setCreatedAt(LocalDateTime.now());
		item.setDescription("Description Test");
		
		Mockito.when(complexRepository.save(item)).thenReturn(item);
		
		repo = context.getBean(ComplexRepository.class);
		repo.save(item);
        Assert.assertEquals(item, item);
        Mockito.verify(complexRepository).save(item);
        
	}
	
	@Test
	void testFindById() {

		Complex item = new Complex();
		item.setActived(true);
		item.setId(1L);
		item.setValue(10L);
		item.setUpdatedAt(LocalDateTime.now());
		item.setCreatedAt(LocalDateTime.now());
		item.setDescription("Description Test");
		
		Mockito.when(complexRepository.findById(item.getId())).thenReturn(Optional.of(item));
		
		repo = context.getBean(ComplexRepository.class);

		Optional<Complex> op = repo.findById(1L);
        Assert.assertEquals(op, Optional.of(item));
        Mockito.verify(complexRepository).findById(item.getId());
        
	}
	
	@Test
	void testCount() {
		System.err.println("testCount");
		Mockito.when(complexRepository.count()).thenReturn(123L);
		
		repo = context.getBean(ComplexRepository.class);
        long count = repo.count();
 
        Assert.assertEquals(123L, count);
        Mockito.verify(complexRepository).count();
	}

}
