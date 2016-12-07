package hackerrank

object UpdateList {

  def f(arr:List[Int]):List[Int] = {
    // arr map math.abs
    arr.map(x => math.abs(x))
  }

  def main(args: Array[String]): Unit = {
    println(f(List(-1,2,3,-4,-5)))
  }

}
