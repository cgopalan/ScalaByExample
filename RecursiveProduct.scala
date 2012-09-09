object HigherOrderFunctions {
  def product(f: Int => Int)(a: Int, b:Int): Int = {
    if (a > b) 1 else f(a) * product(f)(a + 1, b)
  }

  def main(args: Array[String]) {
    println("Product of range of numbers from 3 to 8 is: " + product(x => x)(3,8))
  }
}