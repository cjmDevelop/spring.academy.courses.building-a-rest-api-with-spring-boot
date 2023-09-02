package example.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

//Starts Spring Boot application and makes it available for test to perform requests.
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CashCardApplicationTests {

	@Autowired//Note that while @Autowired is a form of Spring dependency injection it’s best used only in tests.
	TestRestTemplate request;

	@Test
	void shouldReturnACashCardWhenDataIsSaved(){
	ResponseEntity<String> response = request.getForEntity("/cashcards/99", String.class);

	assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	void contextLoads() {
	}

}
