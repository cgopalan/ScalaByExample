object TailRecursiveFactorial {
   def factorial(n: Int, product: Int): Int = 
      if (n == 1) product else factorial(n - 1, n * product)
   
   def main(args: Array[String]) {
   println("Factorial of 8 is: " + factorial(8,1))
   }
}