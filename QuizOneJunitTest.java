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

	@Test
	void testB1() {
		String input = "NEW YEAR";
		int expect = 1;
		int result = quiz.countLetterA(input);
		Assert.assertEquals(expect, result);
	}
	
	@Test
	void testB2() {
		String input = "I AM Happy";
		int expect = 2;
		int result = quiz.countLetterA(input);
		Assert.assertEquals(expect, result);
	}
	
	@Test
	void testB3() {
		String input = "2024";
		int expect = 0;
		int result = quiz.countLetterA(input);
		Assert.assertEquals(expect, result);
	}
	
	@Test
	void testB4() {
		String input = "2024";
		int expect = 0;
		int result = quiz.countLetterA(input);
		Assert.assertEquals(expect, result);
	}
	
	@Test
	void testB5() {
		String input = "";
		int expect = 0;
		int result = quiz.countLetterA(input);
		Assert.assertEquals(expect, result);
	}

	@Test
	void testC1() {
		String input = "A";
		Boolean expect = false;
		Boolean result = quiz.checkTwoLetter(input);
		Assert.assertEquals(expect, result);
	}

	@Test
	void testC2() {
		String input = "AB";
		Boolean expect = true;
		Boolean result = quiz.checkTwoLetter(input);
		Assert.assertEquals(expect, result);
	}

	@Test
	void testC3() {
		String input = "Hello";
		Boolean expect = false;
		Boolean result = quiz.checkTwoLetter(input);
		Assert.assertEquals(expect, result);
	}
	
	@Test
	void testC4() {
		String input = "coco";
		Boolean expect = true;
		Boolean result = quiz.checkTwoLetter(input);
		Assert.assertEquals(expect, result);
	}

	@Test
	void testC5() {
		String input = "kiki";
		Boolean expect = true;
		Boolean result = quiz.checkTwoLetter(input);
		Assert.assertEquals(expect, result);
	}
	
	@Test
	void testC6() {
		String input = "kiekie";
		Boolean expect = false;
		Boolean result = quiz.checkTwoLetter(input);
		Assert.assertEquals(expect, result);
	}

}
