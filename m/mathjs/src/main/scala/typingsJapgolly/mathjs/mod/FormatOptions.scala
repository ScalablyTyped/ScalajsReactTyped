package typingsJapgolly.mathjs.mod

import typingsJapgolly.mathjs.mathjsStrings.auto
import typingsJapgolly.mathjs.mathjsStrings.engineering
import typingsJapgolly.mathjs.mathjsStrings.exponential
import typingsJapgolly.mathjs.mathjsStrings.fixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  /**
    * Available values: 'ratio' (default) or 'decimal'. For example
    * format(fraction(1, 3)) will output '1/3' when 'ratio' is configured,
    * and will output 0.(3) when 'decimal' is configured.
    */
  var fraction: js.UndefOr[String] = js.undefined
  /**
    * Exponent determining the lower boundary for formatting a value with
    * an exponent when notation='auto. Default value is -3.
    */
  var lowerExp: js.UndefOr[Double] = js.undefined
  /**
    * Number notation. Choose from: 'fixed' Always use regular number
    * notation. For example '123.40' and '14000000' 'exponential' Always
    * use exponential notation. For example '1.234e+2' and '1.4e+7' 'auto'
    * (default) Regular number notation for numbers having an absolute
    * value between lower and upper bounds, and uses exponential notation
    * elsewhere. Lower bound is included, upper bound is excluded. For
    * example '123.4' and '1.4e7'.
    */
  var notation: js.UndefOr[fixed | exponential | engineering | auto] = js.undefined
  /**
    * A number between 0 and 16 to round the digits of the number. In case
    * of notations 'exponential' and 'auto', precision defines the total
    * number of significant digits returned and is undefined by default. In
    * case of notation 'fixed', precision defines the number of significant
    * digits after the decimal point, and is 0 by default.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * Exponent determining the upper boundary for formatting a value with
    * an exponent when notation='auto. Default value is 5.
    */
  var upperExp: js.UndefOr[Double] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(
    fraction: String = null,
    lowerExp: Int | Double = null,
    notation: fixed | exponential | engineering | auto = null,
    precision: Int | Double = null,
    upperExp: Int | Double = null
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (lowerExp != null) __obj.updateDynamic("lowerExp")(lowerExp.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (upperExp != null) __obj.updateDynamic("upperExp")(upperExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

