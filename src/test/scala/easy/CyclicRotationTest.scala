package easy

class CyclicRotationTest extends munit.FunSuite {
  test("BinaryGap Test 0") {
    val obtained = BinaryGap.solution(0)
    val expected = 0
    assertEquals(obtained, expected)
  }
  test("BinaryGap Test 1") {
    val obtained = BinaryGap.solution(1)
    val expected = 0
    assertEquals(obtained, expected)
  }
  test("BinaryGap Test 9") {
    val obtained = BinaryGap.solution(9)
    val expected = 2
    assertEquals(obtained, expected)
  }
  test("BinaryGap Test 17") {
    val obtained = BinaryGap.solution(17)
    val expected = 3
    assertEquals(obtained, expected)
  }
  test("BinaryGap Test 12646465") {
    val obtained = BinaryGap.solution(12646465)
    val expected = 6
    assertEquals(obtained, expected)
  }
}
