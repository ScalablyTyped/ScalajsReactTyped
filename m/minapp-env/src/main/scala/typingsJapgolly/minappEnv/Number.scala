package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.minappEnv.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Number extends js.Object {
  /**
    * Returns a string containing a number represented in exponential notation.
    * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
    */
  def toExponential(): java.lang.String = js.native
  def toExponential(fractionDigits: Double): java.lang.String = js.native
  /**
    * Returns a string representing a number in fixed-point notation.
    * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
    */
  def toFixed(): java.lang.String = js.native
  def toFixed(fractionDigits: Double): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String, options: NumberFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: Array[java.lang.String]): java.lang.String = js.native
  def toLocaleString(locales: Array[java.lang.String], options: NumberFormatOptions): java.lang.String = js.native
  /**
    * Returns a string containing a number represented either in exponential or fixed-point notation with a specified number of digits.
    * @param precision Number of significant digits. Must be in the range 1 - 21, inclusive.
    */
  def toPrecision(): java.lang.String = js.native
  def toPrecision(precision: Double): java.lang.String = js.native
  def toString(radix: Double): java.lang.String = js.native
}

/** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
@JSGlobal("Number")
@js.native
object Number extends TopLevel[NumberConstructor]

