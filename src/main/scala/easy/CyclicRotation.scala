package easy

import scala.annotation.tailrec

object CyclicRotation {
  def solution(array: Array[Int], k: Int): Array[Int] = {
    lazy val numberOfNecessaryCycles = k % array.length
    if (array.isEmpty || array.toSet.size == 1 || numberOfNecessaryCycles == 0) array
    else shiftArray(array, numberOfNecessaryCycles)
  }

  @tailrec
  private def shiftArray(array: Array[Int], roundsLeft: Int): Array[Int] = {
    roundsLeft match {
      case 0 => array
      case _ => shiftArray(array.last +: array.dropRight(1), roundsLeft - 1)
    }
  }
}
