package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTipFormatter extends js.Object {
  def tipFormatter(value: Double): String
}

object AnonTipFormatter {
  @scala.inline
  def apply(tipFormatter: Double => CallbackTo[String]): AnonTipFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1((t0: scala.Double) => tipFormatter(t0).runNow()))
    __obj.asInstanceOf[AnonTipFormatter]
  }
}

