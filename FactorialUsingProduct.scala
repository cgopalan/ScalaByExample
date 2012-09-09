object Factorial {
  def product(f: Int => Int)(a: Int, b:Int): Int = {
    if (a > b) 1 else f(a) * product(f)(a + 1, b)
  }
  def factorial(n: Int): Int = {
    product(x => x)(1, n)
  }
  def main(args: Array[String]) {
    println("Factorial of 6 is: " + factorial(6))
  }

}