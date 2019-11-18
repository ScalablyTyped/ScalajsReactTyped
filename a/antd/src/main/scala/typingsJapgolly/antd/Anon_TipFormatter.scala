package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TipFormatter extends js.Object {
  def tipFormatter(value: Double): String
}

object Anon_TipFormatter {
  @scala.inline
  def apply(tipFormatter: Double => CallbackTo[String]): Anon_TipFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1((t0: scala.Double) => tipFormatter(t0).runNow()))
    __obj.asInstanceOf[Anon_TipFormatter]
  }
}

