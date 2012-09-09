object QuickSort {
   def sort(xs: Array[Int]): Array[Int] = {
      if (xs.length <= 1) xs
      else {
         val pivot = xs(xs.length / 2)
         val lessThanPivot = xs filter (pivot >)
         val equalToPivot = xs filter (pivot ==)
         val greaterThanPivot = xs filter (pivot <)
         println("Pivot for array [%s] is %d".format(xs.deep.mkString(" "),
                                                                     pivot))
         println("[%s]   [%s]   [%s]\n".format(lessThanPivot.deep.mkString(" "),
                                                equalToPivot.deep.mkString(" "),
                                           greaterThanPivot.deep.mkString(" ")))
         Array.concat(sort(lessThanPivot), equalToPivot, sort(greaterThanPivot))
      }
   }
   
   def main(args: Array[String]) {
      val inputArray = Array(10,9,8,3,7,6,5,4,3,2,1)
      println("Input Array : [%s]\n".format(inputArray.deep.mkString(" ")))
      println("Sorted Array: [%s]".format(sort(inputArray).deep.mkString(" ")))
   }
}