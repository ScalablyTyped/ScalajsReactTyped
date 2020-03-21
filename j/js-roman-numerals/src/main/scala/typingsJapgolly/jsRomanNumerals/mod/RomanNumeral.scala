package typingsJapgolly.jsRomanNumerals.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RomanNumeral extends js.Object {
  def toInt(): Double
}

object RomanNumeral {
  @scala.inline
  def apply(toInt: CallbackTo[Double]): RomanNumeral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toInt")(toInt.toJsFn)
    __obj.asInstanceOf[RomanNumeral]
  }
}

