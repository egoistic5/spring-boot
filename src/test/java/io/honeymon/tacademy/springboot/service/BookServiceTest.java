package io.honeymon.tacademy.springboot.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class BookServiceTest {
	
	@Autowired
	BookService booService;
	
	@Test
	//( expected=RuntimeException.class )
	public void testFindById() {
		Long id = 1L;
		booService.findById(id)
				.orElseThrow(() -> new RuntimeException("Not found"));
		
	}
}
