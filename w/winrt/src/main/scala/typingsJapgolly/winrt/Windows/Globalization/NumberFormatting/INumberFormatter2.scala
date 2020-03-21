package typingsJapgolly.winrt.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFormatter2 extends js.Object {
  def formatDouble(value: Double): String
  def formatInt(value: Double): String
  def formatUInt(value: Double): String
}

object INumberFormatter2 {
  @scala.inline
  def apply(
    formatDouble: Double => CallbackTo[String],
    formatInt: Double => CallbackTo[String],
    formatUInt: Double => CallbackTo[String]
  ): INumberFormatter2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formatDouble")(js.Any.fromFunction1((t0: scala.Double) => formatDouble(t0).runNow()))
    __obj.updateDynamic("formatInt")(js.Any.fromFunction1((t0: scala.Double) => formatInt(t0).runNow()))
    __obj.updateDynamic("formatUInt")(js.Any.fromFunction1((t0: scala.Double) => formatUInt(t0).runNow()))
    __obj.asInstanceOf[INumberFormatter2]
  }
}

