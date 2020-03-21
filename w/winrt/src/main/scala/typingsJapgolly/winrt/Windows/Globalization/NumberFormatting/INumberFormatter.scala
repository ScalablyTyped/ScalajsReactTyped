package typingsJapgolly.winrt.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFormatter extends js.Object {
  def format(value: Double): String
}

object INumberFormatter {
  @scala.inline
  def apply(format: Double => CallbackTo[String]): INumberFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: scala.Double) => format(t0).runNow()))
    __obj.asInstanceOf[INumberFormatter]
  }
}

