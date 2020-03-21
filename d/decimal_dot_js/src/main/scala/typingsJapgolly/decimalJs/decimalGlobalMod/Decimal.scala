package typingsJapgolly.decimalJs.decimalGlobalMod

import typingsJapgolly.decimalJs.decimalJsNumbers.`0`
import typingsJapgolly.decimalJs.decimalJsNumbers.`1`
import typingsJapgolly.decimalJs.decimalJsNumbers.`2`
import typingsJapgolly.decimalJs.decimalJsNumbers.`3`
import typingsJapgolly.decimalJs.decimalJsNumbers.`4`
import typingsJapgolly.decimalJs.decimalJsNumbers.`5`
import typingsJapgolly.decimalJs.decimalJsNumbers.`6`
import typingsJapgolly.decimalJs.decimalJsNumbers.`7`
import typingsJapgolly.decimalJs.decimalJsNumbers.`8`
import typingsJapgolly.decimalJs.decimalJsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decimal.js/decimal.global", "Decimal")
@js.native
class Decimal protected () extends js.Object {
  def this(n: DecimalValue) = this()
  val d: js.Array[Double] = js.native
  val e: Double = js.native
  val name: String = js.native
  val s: Double = js.native
  def abs(): Decimal = js.native
  def absoluteValue(): Decimal = js.native
  def acos(): Decimal = js.native
  def acosh(): Decimal = js.native
  def add(n: DecimalValue): Decimal = js.native
  def asin(): Decimal = js.native
  def asinh(): Decimal = js.native
  def atan(): Decimal = js.native
  def atanh(): Decimal = js.native
  def cbrt(): Decimal = js.native
  def ceil(): Decimal = js.native
  def cmp(n: DecimalValue): Double = js.native
  def comparedTo(n: DecimalValue): Double = js.native
  def cos(): Decimal = js.native
  def cosh(): Decimal = js.native
  def cosine(): Decimal = js.native
  def cubeRoot(): Decimal = js.native
  def decimalPlaces(): Double = js.native
  def div(n: DecimalValue): Decimal = js.native
  def divToInt(n: DecimalValue): Decimal = js.native
  def dividedBy(n: DecimalValue): Decimal = js.native
  def dividedToIntegerBy(n: DecimalValue): Decimal = js.native
  def dp(): Double = js.native
  def eq(n: DecimalValue): Boolean = js.native
  def equals(n: DecimalValue): Boolean = js.native
  def exp(): Decimal = js.native
  def floor(): Decimal = js.native
  def greaterThan(n: DecimalValue): Boolean = js.native
  def greaterThanOrEqualTo(n: DecimalValue): Boolean = js.native
  def gt(n: DecimalValue): Boolean = js.native
  def gte(n: DecimalValue): Boolean = js.native
  def hyperbolicCosine(): Decimal = js.native
  def hyperbolicSine(): Decimal = js.native
  def hyperbolicTangent(): Decimal = js.native
  def inverseCosine(): Decimal = js.native
  def inverseHyperbolicCosine(): Decimal = js.native
  def inverseHyperbolicSine(): Decimal = js.native
  def inverseHyperbolicTangent(): Decimal = js.native
  def inverseSine(): Decimal = js.native
  def inverseTangent(): Decimal = js.native
  def isFinite(): Boolean = js.native
  def isInt(): Boolean = js.native
  def isInteger(): Boolean = js.native
  def isNaN(): Boolean = js.native
  def isNeg(): Boolean = js.native
  def isNegative(): Boolean = js.native
  def isPos(): Boolean = js.native
  def isPositive(): Boolean = js.native
  def isZero(): Boolean = js.native
  def lessThan(n: DecimalValue): Boolean = js.native
  def lessThanOrEqualTo(n: DecimalValue): Boolean = js.native
  def ln(): Decimal = js.native
  def log(): Decimal = js.native
  def log(n: DecimalValue): Decimal = js.native
  def logarithm(): Decimal = js.native
  def logarithm(n: DecimalValue): Decimal = js.native
  def lt(n: DecimalValue): Boolean = js.native
  def lte(n: DecimalValue): Boolean = js.native
  def minus(n: DecimalValue): Decimal = js.native
  def mod(n: DecimalValue): Decimal = js.native
  def modulo(n: DecimalValue): Decimal = js.native
  def mul(n: DecimalValue): Decimal = js.native
  def naturalExponential(): Decimal = js.native
  def naturalLogarithm(): Decimal = js.native
  def neg(): Decimal = js.native
  def negated(): Decimal = js.native
  def plus(n: DecimalValue): Decimal = js.native
  def pow(n: DecimalValue): Decimal = js.native
  def precision(): Double = js.native
  def precision(includeZeros: Boolean): Double = js.native
  def round(): Decimal = js.native
  def sd(): Double = js.native
  def sd(includeZeros: Boolean): Double = js.native
  def sin(): Decimal = js.native
  def sine(): Decimal = js.native
  def sinh(): Decimal = js.native
  def sqrt(): Decimal = js.native
  def squareRoot(): Decimal = js.native
  def sub(n: DecimalValue): Decimal = js.native
  def tan(): Decimal = js.native
  def tangent(): Decimal = js.native
  def tanh(): Decimal = js.native
  def times(n: DecimalValue): Decimal = js.native
  def toBinary(): String = js.native
  def toBinary(significantDigits: Double): String = js.native
  def toBinary(significantDigits: Double, rounding: DecimalRounding): String = js.native
  def toDP(): Decimal = js.native
  def toDP(decimalPlaces: Double): Decimal = js.native
  def toDP(decimalPlaces: Double, rounding: DecimalRounding): Decimal = js.native
  def toDecimalPlaces(): Decimal = js.native
  def toDecimalPlaces(decimalPlaces: Double): Decimal = js.native
  def toDecimalPlaces(decimalPlaces: Double, rounding: DecimalRounding): Decimal = js.native
  def toExponential(): String = js.native
  def toExponential(decimalPlaces: Double): String = js.native
  def toExponential(decimalPlaces: Double, rounding: DecimalRounding): String = js.native
  def toFixed(): String = js.native
  def toFixed(decimalPlaces: Double): String = js.native
  def toFixed(decimalPlaces: Double, rounding: DecimalRounding): String = js.native
  def toFraction(): js.Array[Decimal] = js.native
  def toFraction(max_denominator: DecimalValue): js.Array[Decimal] = js.native
  def toHex(): String = js.native
  def toHex(significantDigits: Double): String = js.native
  def toHex(significantDigits: Double, rounding: DecimalRounding): String = js.native
  def toHexadecimal(): String = js.native
  def toHexadecimal(significantDigits: Double): String = js.native
  def toHexadecimal(significantDigits: Double, rounding: DecimalRounding): String = js.native
  def toJSON(): String = js.native
  def toNearest(n: DecimalValue): Decimal = js.native
  def toNearest(n: DecimalValue, rounding: DecimalRounding): Decimal = js.native
  def toNumber(): Double = js.native
  def toOctal(): String = js.native
  def toOctal(significantDigits: Double): String = js.native
  def toOctal(significantDigits: Double, rounding: DecimalRounding): String = js.native
  def toPower(n: DecimalValue): Decimal = js.native
  def toPrecision(): String = js.native
  def toPrecision(significantDigits: Double): String = js.native
  def toPrecision(significantDigits: Double, rounding: DecimalRounding): String = js.native
  def toSD(): Decimal = js.native
  def toSD(significantDigits: Double): Decimal = js.native
  def toSD(significantDigits: Double, rounding: DecimalRounding): Decimal = js.native
  def toSignificantDigits(): Decimal = js.native
  def toSignificantDigits(significantDigits: Double): Decimal = js.native
  def toSignificantDigits(significantDigits: Double, rounding: DecimalRounding): Decimal = js.native
  def trunc(): Decimal = js.native
  def truncated(): Decimal = js.native
}

/* static members */
@JSImport("decimal.js/decimal.global", "Decimal")
@js.native
object Decimal extends js.Object {
  val Decimal: js.UndefOr[DecimalConstructor] = js.native
  val EUCLID: `9` = js.native
  val ROUND_CEIL: `2` = js.native
  val ROUND_DOWN: `1` = js.native
  val ROUND_FLOOR: `3` = js.native
  val ROUND_HALF_CEIL: `7` = js.native
  val ROUND_HALF_DOWN: `5` = js.native
  val ROUND_HALF_EVEN: `6` = js.native
  val ROUND_HALF_FLOOR: `8` = js.native
  val ROUND_HALF_UP: `4` = js.native
  val ROUND_UP: `0` = js.native
  val crypto: Boolean = js.native
  val default: js.UndefOr[DecimalConstructor] = js.native
  val maxE: Double = js.native
  val minE: Double = js.native
  val modulo: DecimalModulo = js.native
  val precision: Double = js.native
  val rounding: DecimalRounding = js.native
  val toExpNeg: Double = js.native
  val toExpPos: Double = js.native
  def abs(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def acos(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def acosh(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def add(x: DecimalValue, y: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def asin(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def asinh(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def atan(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def atan2(y: DecimalValue, x: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def atanh(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def cbrt(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def ceil(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def clone(`object`: DecimalConfig): DecimalConstructor = js.native
  def config(`object`: DecimalConfig): DecimalConstructor = js.native
  def cos(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def cosh(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def div(x: DecimalValue, y: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def exp(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def floor(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def hypot(n: DecimalValue*): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def isDecimal(`object`: js.Any): Boolean = js.native
  def ln(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def log(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def log(n: DecimalValue, base: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def log10(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def log2(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def max(n: DecimalValue*): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def min(n: DecimalValue*): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def mod(x: DecimalValue, y: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def mul(x: DecimalValue, y: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def noConflict(): DecimalConstructor = js.native
     // Browser only
  def pow(base: DecimalValue, exponent: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def random(): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def random(significantDigits: Double): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def round(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def set(`object`: DecimalConfig): DecimalConstructor = js.native
  def sign(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def sin(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def sinh(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def sqrt(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def sub(x: DecimalValue, y: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def tan(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def tanh(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  def trunc(n: DecimalValue): typingsJapgolly.decimalJs.decimalGlobalMod.Decimal = js.native
  type Config = DecimalConfig
  type Constructor = DecimalConstructor
  type Instance = DecimalInstance
  type Modulo = DecimalModulo
  type Rounding = DecimalRounding
  type Value = DecimalValue
}

