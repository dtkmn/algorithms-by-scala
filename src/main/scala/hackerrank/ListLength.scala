package hackerrank

object ListLength {

  def f(arr:List[Int]):Int = {
    arr.zipWithIndex.last._2 + 1
  }

  def main(args: Array[String]) {
    println(f(List(1,2,3,4,5)))
  }

}
