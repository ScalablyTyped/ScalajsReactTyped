package typingsJapgolly.bigint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigInt")
@js.native
object BigInt extends js.Object {
  def GCD(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def GCD_(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  def add(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def addInt(x: typingsJapgolly.bigint.BigInt.BigInt, n: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def addInt_(x: typingsJapgolly.bigint.BigInt.BigInt, n: Double): Unit = js.native
  @JSName("addShift_")
  def addShift(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt, ys: Double): Unit = js.native
  def add_(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  def bigInt2str(x: typingsJapgolly.bigint.BigInt.BigInt, base: String): String = js.native
  def bigInt2str(x: typingsJapgolly.bigint.BigInt.BigInt, base: Double): String = js.native
  def bitSize(x: typingsJapgolly.bigint.BigInt.BigInt): Double = js.native
  @JSName("carry_")
  def carry(x: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  @JSName("copy_")
  def copy(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  @JSName("copyInt_")
  def copyInt(x: typingsJapgolly.bigint.BigInt.BigInt, n: Double): Unit = js.native
  @JSName("divInt_")
  def divInt(x: typingsJapgolly.bigint.BigInt.BigInt, n: Double): Double = js.native
  @JSName("divide_")
  def divide(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    q: typingsJapgolly.bigint.BigInt.BigInt,
    r: typingsJapgolly.bigint.BigInt.BigInt
  ): Unit = js.native
  def dup(x: typingsJapgolly.bigint.BigInt.BigInt): typingsJapgolly.bigint.BigInt.BigInt = js.native
  @JSName("eGCD_")
  def eGCD(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    d: typingsJapgolly.bigint.BigInt.BigInt,
    a: typingsJapgolly.bigint.BigInt.BigInt,
    b: typingsJapgolly.bigint.BigInt.BigInt
  ): Unit = js.native
  def equals(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): Boolean = js.native
  def equalsInt(x: typingsJapgolly.bigint.BigInt.BigInt, y: Double): Boolean = js.native
  def expand(value: typingsJapgolly.bigint.BigInt.BigInt, n: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def findPrimes(n: Double): js.Array[Double] = js.native
  def greater(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): Boolean = js.native
  def greaterShift(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt, shift: Double): Boolean = js.native
  @JSName("halve_")
  def halve(x: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  def int2bigInt(t: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def int2bigInt(t: Double, n: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def int2bigInt(t: Double, n: Double, m: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def inverseMod(x: typingsJapgolly.bigint.BigInt.BigInt, n: typingsJapgolly.bigint.BigInt.BigInt): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def inverseModInt(x: Double, n: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def inverseMod_(x: typingsJapgolly.bigint.BigInt.BigInt, n: typingsJapgolly.bigint.BigInt.BigInt): Boolean = js.native
  def isZero(x: typingsJapgolly.bigint.BigInt.BigInt): Boolean = js.native
  @JSName("leftShift_")
  def leftShift(x: typingsJapgolly.bigint.BigInt.BigInt, n: Double): Unit = js.native
  @JSName("linComb_")
  def linComb(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    a: Double,
    b: Double
  ): Unit = js.native
  @JSName("linCombShift_")
  def linCombShift(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    b: Double,
    ys: Double
  ): Unit = js.native
  def millerRabin(x: typingsJapgolly.bigint.BigInt.BigInt, b: typingsJapgolly.bigint.BigInt.BigInt): Boolean = js.native
  def millerRabinInt(x: Double, b: Double): Boolean = js.native
  def mod(x: typingsJapgolly.bigint.BigInt.BigInt, n: typingsJapgolly.bigint.BigInt.BigInt): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def modInt(x: typingsJapgolly.bigint.BigInt.BigInt, n: Double): Double = js.native
  def mod_(x: typingsJapgolly.bigint.BigInt.BigInt, n: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  @JSName("mont_")
  def mont(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    n: typingsJapgolly.bigint.BigInt.BigInt,
    np: Double
  ): Unit = js.native
  def mult(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): typingsJapgolly.bigint.BigInt.BigInt = js.native
  @JSName("multInt_")
  def multInt(x: typingsJapgolly.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def multMod(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    n: typingsJapgolly.bigint.BigInt.BigInt
  ): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def multMod_(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    n: typingsJapgolly.bigint.BigInt.BigInt
  ): Unit = js.native
  def mult_(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  def negative(x: typingsJapgolly.bigint.BigInt.BigInt): Boolean = js.native
  def powMod(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    n: typingsJapgolly.bigint.BigInt.BigInt
  ): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def powMod_(
    x: typingsJapgolly.bigint.BigInt.BigInt,
    y: typingsJapgolly.bigint.BigInt.BigInt,
    n: typingsJapgolly.bigint.BigInt.BigInt
  ): Unit = js.native
  def randBigInt(n: Double, s: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def randBigInt_(b: typingsJapgolly.bigint.BigInt.BigInt, n: Double, s: Double): Unit = js.native
  def randProbPrime(k: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def randTruePrime(k: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def randTruePrime_(ans: typingsJapgolly.bigint.BigInt.BigInt, k: Double): Unit = js.native
  @JSName("rightShift_")
  def rightShift(x: typingsJapgolly.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def setRandom(random: IRandom): Unit = js.native
  @JSName("squareMod_")
  def squareMod(x: typingsJapgolly.bigint.BigInt.BigInt, n: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  def str2bigInt(s: String, b: String): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: String, n: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: String, n: Double, m: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double, n: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double, n: Double, m: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  def sub(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): typingsJapgolly.bigint.BigInt.BigInt = js.native
  @JSName("subShift_")
  def subShift(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt, ys: Double): Unit = js.native
  def sub_(x: typingsJapgolly.bigint.BigInt.BigInt, y: typingsJapgolly.bigint.BigInt.BigInt): Unit = js.native
  def trim(x: typingsJapgolly.bigint.BigInt.BigInt, k: Double): typingsJapgolly.bigint.BigInt.BigInt = js.native
  type BigInt = js.Array[Double]
  type IRandom = js.Function0[Double]
}

