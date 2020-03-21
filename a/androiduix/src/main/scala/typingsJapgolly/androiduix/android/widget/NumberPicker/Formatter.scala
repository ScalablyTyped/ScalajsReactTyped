package typingsJapgolly.androiduix.android.widget.NumberPicker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter extends js.Object {
  def format(value: Double): String
}

object Formatter {
  @scala.inline
  def apply(format: Double => CallbackTo[String]): Formatter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: scala.Double) => format(t0).runNow()))
    __obj.asInstanceOf[Formatter]
  }
}

