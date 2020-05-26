package ie.mcmahon

import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator Standard Cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
  test("CubeCalculator 0 Cube"){
    assert(CubeCalculator.cube(0) === 0)
  }
}