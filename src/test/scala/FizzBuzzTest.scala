import FizzBuzz._
import org.specs2.mutable._

class FizzBuzzTest extends Specification {

  "FizzBuzz".title

  "fizzBuzz should return" should {
    "1 when given 1" in {
      fizzbuzz(1) must equalTo("1")
    }
    "2 when given 2" in {
      fizzbuzz(2) must equalTo("2")
    }
    "3 when given Fizz" in {
      fizzbuzz(3) must equalTo("Fizz")
    }
    "5 when given Buzz" in {
      fizzbuzz(5) must equalTo("Buzz")
    }
    "6 when given Fizz" in {
      fizzbuzz(6) must equalTo("Fizz")
    }
    "10 when given Buzz" in {
      fizzbuzz(10) must equalTo("Buzz")
    }
    "15 when given Buzz" in {
      fizzbuzz(15) must equalTo("FizzBuzz")
    }
  }
}
