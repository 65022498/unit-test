import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuizOneJunitTest {

	QuizOneJunit quiz;
	@BeforeEach
	void setUp() throws Exception {
		this.quiz = new QuizOneJunit();
	}

	@Test
	void testA1() {
		int input = 4;
		int expect = 16;
		int result = quiz.square(input);
		Assert.assertEquals(expect, result);
	}
	@Test
	void testA2() {
		int input = -2;
		int expect = 4;
		int result = quiz.square(input);
		Assert.assertEquals(expect, result);
	}

}
