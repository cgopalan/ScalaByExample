object FirstClassFunctions {
  def sum(f: Int => Int)(a: Int, b:Int): Int = {
    def iter(a: Int, result: Int): Int =
      if (a > b) result
      else iter(a + 1, f(a) + result)
    iter(a,0)
  }
  
  def main(args: Array[String]) {
    println("Sum is: " + sum(x => x)(1,10))
  }
}