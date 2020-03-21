package typingsJapgolly.linearGradient.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gradient extends js.Object {
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  def calcArray(normalizedPercent: Double): Color
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  def calcHex(normalizedPrecent: Double): String
}

object Gradient {
  @scala.inline
  def apply(calcArray: Double => CallbackTo[Color], calcHex: Double => CallbackTo[String]): Gradient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calcArray")(js.Any.fromFunction1((t0: scala.Double) => calcArray(t0).runNow()))
    __obj.updateDynamic("calcHex")(js.Any.fromFunction1((t0: scala.Double) => calcHex(t0).runNow()))
    __obj.asInstanceOf[Gradient]
  }
}

