package typingsJapgolly.miniprogramWxs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Math extends StObject {
  
  /** The mathematical constant e. This is Euler's number, the base of natural logarithms. */
  val E: Double
  
  /** The natural logarithm of 10. */
  val LN10: Double
  
  /** The natural logarithm of 2. */
  val LN2: Double
  
  /** The base-10 logarithm of e. */
  val LOG10E: Double
  
  /** The base-2 logarithm of e. */
  val LOG2E: Double
  
  /** Pi. This is the ratio of the circumference of a circle to its diameter. */
  val PI: Double
  
  /** The square root of 0.5, or, equivalently, one divided by the square root of 2. */
  val SQRT1_2: Double
  
  /** The square root of 2. */
  val SQRT2: Double
  
  /**
    * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
    * For example, the absolute value of -5 is the same as the absolute value of 5.
    * @param x A numeric expression for which the absolute value is needed.
    */
  def abs(x: Double): Double
  
  /**
    * Returns the arc cosine (or inverse cosine) of a number.
    * @param x A numeric expression.
    */
  def acos(x: Double): Double
  
  /**
    * Returns the arcsine of a number.
    * @param x A numeric expression.
    */
  def asin(x: Double): Double
  
  /**
    * Returns the arctangent of a number.
    * @param x A numeric expression for which the arctangent is needed.
    */
  def atan(x: Double): Double
  
  /**
    * Returns the angle (in radians) from the X axis to a point.
    * @param y A numeric expression representing the cartesian y-coordinate.
    * @param x A numeric expression representing the cartesian x-coordinate.
    */
  def atan2(y: Double, x: Double): Double
  
  /**
    * Returns the smallest integer greater than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def ceil(x: Double): Double
  
  /**
    * Returns the cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cos(x: Double): Double
  
  /**
    * Returns e (the base of natural logarithms) raised to a power.
    * @param x A numeric expression representing the power of e.
    */
  def exp(x: Double): Double
  
  /**
    * Returns the greatest integer less than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def floor(x: Double): Double
  
  /**
    * Returns the natural logarithm (base e) of a number.
    * @param x A numeric expression.
    */
  def log(x: Double): Double
  
  /**
    * Returns the larger of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def max(values: Double*): Double
  
  /**
    * Returns the smaller of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def min(values: Double*): Double
  
  /**
    * Returns the value of a base expression taken to a specified power.
    * @param x The base value of the expression.
    * @param y The exponent value of the expression.
    */
  def pow(x: Double, y: Double): Double
  
  /** Returns a pseudorandom number between 0 and 1. */
  def random(): Double
  
  /**
    * Returns a supplied numeric expression rounded to the nearest number.
    * @param x The value to be rounded to the nearest number.
    */
  def round(x: Double): Double
  
  /**
    * Returns the sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sin(x: Double): Double
  
  /**
    * Returns the square root of a number.
    * @param x A numeric expression.
    */
  def sqrt(x: Double): Double
  
  /**
    * Returns the tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tan(x: Double): Double
}
object Math {
  
  inline def apply(
    E: Double,
    LN10: Double,
    LN2: Double,
    LOG10E: Double,
    LOG2E: Double,
    PI: Double,
    SQRT1_2: Double,
    SQRT2: Double,
    abs: Double => Double,
    acos: Double => Double,
    asin: Double => Double,
    atan: Double => Double,
    atan2: (Double, Double) => Double,
    ceil: Double => Double,
    cos: Double => Double,
    exp: Double => Double,
    floor: Double => Double,
    log: Double => Double,
    max: /* repeated */ Double => Double,
    min: /* repeated */ Double => Double,
    pow: (Double, Double) => Double,
    random: CallbackTo[Double],
    round: Double => Double,
    sin: Double => Double,
    sqrt: Double => Double,
    tan: Double => Double
  ): Math = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], LN10 = LN10.asInstanceOf[js.Any], LN2 = LN2.asInstanceOf[js.Any], LOG10E = LOG10E.asInstanceOf[js.Any], LOG2E = LOG2E.asInstanceOf[js.Any], PI = PI.asInstanceOf[js.Any], SQRT1_2 = SQRT1_2.asInstanceOf[js.Any], SQRT2 = SQRT2.asInstanceOf[js.Any], abs = js.Any.fromFunction1(abs), acos = js.Any.fromFunction1(acos), asin = js.Any.fromFunction1(asin), atan = js.Any.fromFunction1(atan), atan2 = js.Any.fromFunction2(atan2), ceil = js.Any.fromFunction1(ceil), cos = js.Any.fromFunction1(cos), exp = js.Any.fromFunction1(exp), floor = js.Any.fromFunction1(floor), log = js.Any.fromFunction1(log), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), pow = js.Any.fromFunction2(pow), random = random.toJsFn, round = js.Any.fromFunction1(round), sin = js.Any.fromFunction1(sin), sqrt = js.Any.fromFunction1(sqrt), tan = js.Any.fromFunction1(tan))
    __obj.asInstanceOf[Math]
  }
  
  extension [Self <: Math](x: Self) {
    
    inline def setAbs(value: Double => Double): Self = StObject.set(x, "abs", js.Any.fromFunction1(value))
    
    inline def setAcos(value: Double => Double): Self = StObject.set(x, "acos", js.Any.fromFunction1(value))
    
    inline def setAsin(value: Double => Double): Self = StObject.set(x, "asin", js.Any.fromFunction1(value))
    
    inline def setAtan(value: Double => Double): Self = StObject.set(x, "atan", js.Any.fromFunction1(value))
    
    inline def setAtan2(value: (Double, Double) => Double): Self = StObject.set(x, "atan2", js.Any.fromFunction2(value))
    
    inline def setCeil(value: Double => Double): Self = StObject.set(x, "ceil", js.Any.fromFunction1(value))
    
    inline def setCos(value: Double => Double): Self = StObject.set(x, "cos", js.Any.fromFunction1(value))
    
    inline def setE(value: Double): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setExp(value: Double => Double): Self = StObject.set(x, "exp", js.Any.fromFunction1(value))
    
    inline def setFloor(value: Double => Double): Self = StObject.set(x, "floor", js.Any.fromFunction1(value))
    
    inline def setLN10(value: Double): Self = StObject.set(x, "LN10", value.asInstanceOf[js.Any])
    
    inline def setLN2(value: Double): Self = StObject.set(x, "LN2", value.asInstanceOf[js.Any])
    
    inline def setLOG10E(value: Double): Self = StObject.set(x, "LOG10E", value.asInstanceOf[js.Any])
    
    inline def setLOG2E(value: Double): Self = StObject.set(x, "LOG2E", value.asInstanceOf[js.Any])
    
    inline def setLog(value: Double => Double): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setMax(value: /* repeated */ Double => Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMin(value: /* repeated */ Double => Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setPI(value: Double): Self = StObject.set(x, "PI", value.asInstanceOf[js.Any])
    
    inline def setPow(value: (Double, Double) => Double): Self = StObject.set(x, "pow", js.Any.fromFunction2(value))
    
    inline def setRandom(value: CallbackTo[Double]): Self = StObject.set(x, "random", value.toJsFn)
    
    inline def setRound(value: Double => Double): Self = StObject.set(x, "round", js.Any.fromFunction1(value))
    
    inline def setSQRT1_2(value: Double): Self = StObject.set(x, "SQRT1_2", value.asInstanceOf[js.Any])
    
    inline def setSQRT2(value: Double): Self = StObject.set(x, "SQRT2", value.asInstanceOf[js.Any])
    
    inline def setSin(value: Double => Double): Self = StObject.set(x, "sin", js.Any.fromFunction1(value))
    
    inline def setSqrt(value: Double => Double): Self = StObject.set(x, "sqrt", js.Any.fromFunction1(value))
    
    inline def setTan(value: Double => Double): Self = StObject.set(x, "tan", js.Any.fromFunction1(value))
  }
}
