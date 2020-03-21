package typingsJapgolly.es6Shim

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  /**
    * Returns the inverse hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def acosh(x: Double): Double
  /**
    * Returns the inverse hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def asinh(x: Double): Double
  /**
    * Returns the inverse hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def atanh(x: Double): Double
  /**
    * Returns an implementation-dependent approximation to the cube root of number.
    * @param x A numeric expression.
    */
  def cbrt(x: Double): Double
  /**
    * Returns the number of leading zero bits in the 32-bit binary representation of a number.
    * @param x A numeric expression.
    */
  def clz32(x: Double): Double
  /**
    * Returns the hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cosh(x: Double): Double
  /**
    * Returns the result of (e^x - 1) of x (e raised to the power of x, where e is the base of
    * the natural logarithms).
    * @param x A numeric expression.
    */
  def expm1(x: Double): Double
  /**
    * Returns the nearest single precision float representation of a number.
    * @param x A numeric expression.
    */
  def fround(x: Double): Double
  /**
    * Returns the square root of the sum of squares of its arguments.
    * @param values Values to compute the square root for.
    *     If no arguments are passed, the result is +0.
    *     If there is only one argument, the result is the absolute value.
    *     If any argument is +Infinity or -Infinity, the result is +Infinity.
    *     If any argument is NaN, the result is NaN.
    *     If all arguments are either +0 or −0, the result is +0.
    */
  def hypot(values: Double*): Double
  /**
    * Returns the result of 32-bit multiplication of two numbers.
    * @param x First number
    * @param y Second number
    */
  def imul(x: Double, y: Double): Double
  /**
    * Returns the base 10 logarithm of a number.
    * @param x A numeric expression.
    */
  def log10(x: Double): Double
  /**
    * Returns the natural logarithm of 1 + x.
    * @param x A numeric expression.
    */
  def log1p(x: Double): Double
  /**
    * Returns the base 2 logarithm of a number.
    * @param x A numeric expression.
    */
  def log2(x: Double): Double
  /**
    * Returns the sign of the x, indicating whether x is positive, negative or zero.
    * @param x The numeric expression to test
    */
  def sign(x: Double): Double
  /**
    * Returns the hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sinh(x: Double): Double
  /**
    * Returns the hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tanh(x: Double): Double
  /**
    * Returns the integral part of the a numeric expression, x, removing any fractional digits.
    * If x is already an integer, the result is x.
    * @param x A numeric expression.
    */
  def trunc(x: Double): Double
}

object Math {
  @scala.inline
  def apply(
    acosh: Double => CallbackTo[Double],
    asinh: Double => CallbackTo[Double],
    atanh: Double => CallbackTo[Double],
    cbrt: Double => CallbackTo[Double],
    clz32: Double => CallbackTo[Double],
    cosh: Double => CallbackTo[Double],
    expm1: Double => CallbackTo[Double],
    fround: Double => CallbackTo[Double],
    hypot: /* repeated */ Double => CallbackTo[Double],
    imul: (Double, Double) => CallbackTo[Double],
    log10: Double => CallbackTo[Double],
    log1p: Double => CallbackTo[Double],
    log2: Double => CallbackTo[Double],
    sign: Double => CallbackTo[Double],
    sinh: Double => CallbackTo[Double],
    tanh: Double => CallbackTo[Double],
    trunc: Double => CallbackTo[Double]
  ): Math = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acosh")(js.Any.fromFunction1((t0: scala.Double) => acosh(t0).runNow()))
    __obj.updateDynamic("asinh")(js.Any.fromFunction1((t0: scala.Double) => asinh(t0).runNow()))
    __obj.updateDynamic("atanh")(js.Any.fromFunction1((t0: scala.Double) => atanh(t0).runNow()))
    __obj.updateDynamic("cbrt")(js.Any.fromFunction1((t0: scala.Double) => cbrt(t0).runNow()))
    __obj.updateDynamic("clz32")(js.Any.fromFunction1((t0: scala.Double) => clz32(t0).runNow()))
    __obj.updateDynamic("cosh")(js.Any.fromFunction1((t0: scala.Double) => cosh(t0).runNow()))
    __obj.updateDynamic("expm1")(js.Any.fromFunction1((t0: scala.Double) => expm1(t0).runNow()))
    __obj.updateDynamic("fround")(js.Any.fromFunction1((t0: scala.Double) => fround(t0).runNow()))
    __obj.updateDynamic("hypot")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => hypot(t0).runNow()))
    __obj.updateDynamic("imul")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => imul(t0, t1).runNow()))
    __obj.updateDynamic("log10")(js.Any.fromFunction1((t0: scala.Double) => log10(t0).runNow()))
    __obj.updateDynamic("log1p")(js.Any.fromFunction1((t0: scala.Double) => log1p(t0).runNow()))
    __obj.updateDynamic("log2")(js.Any.fromFunction1((t0: scala.Double) => log2(t0).runNow()))
    __obj.updateDynamic("sign")(js.Any.fromFunction1((t0: scala.Double) => sign(t0).runNow()))
    __obj.updateDynamic("sinh")(js.Any.fromFunction1((t0: scala.Double) => sinh(t0).runNow()))
    __obj.updateDynamic("tanh")(js.Any.fromFunction1((t0: scala.Double) => tanh(t0).runNow()))
    __obj.updateDynamic("trunc")(js.Any.fromFunction1((t0: scala.Double) => trunc(t0).runNow()))
    __obj.asInstanceOf[Math]
  }
}

