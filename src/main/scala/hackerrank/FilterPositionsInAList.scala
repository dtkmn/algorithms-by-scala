package hackerrank

object FilterPositionsInAList {

  def f(arr: List[Int]) : List[Int] = {
    arr.zipWithIndex
      .filter(_._2 % 2 != 0)
      .map(_._1)
  }

  def main(args: Array[String]): Unit = {
    println(f(List(1,2,3,4,5)))
  }

}
