package io.honeymon.tacademy.springboot.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class BookServiceTest {
	
	@Autowired
	BookService bookService;
	
	public void testFindById() {
		Long id = 1L;
		
		bookService.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}
}
