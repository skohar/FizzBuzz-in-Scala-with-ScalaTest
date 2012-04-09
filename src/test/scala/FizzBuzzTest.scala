import org.scalatest.FunSuite
import FizzBuzz._

class FizzBuzzTest extends FunSuite {

  test("fizzbuzz returns '1' when it take 1 as an argument.") {

    assert(fizzbuzz(1) === "1")
    assert(fizzbuzz(2) === "2")
    assert(fizzbuzz(3) === "Fizz")
    assert(fizzbuzz(5) === "Buzz")
  }
}
