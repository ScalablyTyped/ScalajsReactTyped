package typingsJapgolly.rmcInputNumber

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: Double
  var min: Double
  var step: Double
  def onBlur(): Unit
  def onChange(): Unit
  def onFocus(): Unit
  def parser(input: String): String
}

object AnonMax {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    onBlur: Callback,
    onChange: Callback,
    onFocus: Callback,
    parser: String => CallbackTo[String],
    step: Double
  ): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.updateDynamic("parser")(js.Any.fromFunction1((t0: java.lang.String) => parser(t0).runNow()))
    __obj.asInstanceOf[AnonMax]
  }
}

