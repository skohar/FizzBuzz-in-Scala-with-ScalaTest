object FizzBuzz {
  def fizzbuzz(num: Integer): String = {
    if (num % 3 == 0) {
      "Fizz"
    } else if (num == 5) {
      "Buzz"
    } else {
      num.toString
    }
  }
}
