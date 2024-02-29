package easy

import scala.annotation.tailrec

object BinaryGap {
  def solution(n: Int): Int = {
    getBinaryGap(processBeginning(n))
  }

  private def isModuloZero(n: Int): Boolean = n % 2 == 0

  @tailrec
  private def processBeginning(number: Int): Int = {
    if ((number != 0 && number != 1) && isModuloZero(number)) processBeginning(number / 2)
    else number
  }

  @tailrec
  private def getBinaryGap(number: Int, currentGap: Int = 0, maxGap: Int = 0): Int = {
    number match {
      case 0 => maxGap
      case 1 => if (currentGap > maxGap) currentGap else maxGap
      case _ =>
        val (recCurrentGap, recMaxGap) =
          if (isModuloZero(number)) (currentGap + 1, maxGap)
          else if (currentGap > maxGap) (0, currentGap)
          else (0, maxGap)
        getBinaryGap(number / 2, recCurrentGap, recMaxGap)
    }
  }
}
