package io.honeymon.tacademy.springboot.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class BookServiceTest {
	
	@Autowired
	BookService booService;
	
	@Test//(expected = RuntimeException.class)
	public void testFindById() {
		Long id = 1L;
		booService.findById(id)
				.orElseThrow(() -> new RuntimeException("Not found"));
		
	}
}
