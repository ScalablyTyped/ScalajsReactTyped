package typingsJapgolly.rmcInputNumber

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusOnUpDown extends js.Object {
  var focusOnUpDown: Boolean
  var max: Double
  var min: Double
  var prefixCls: String
  var step: Double
  var useTouch: Boolean
  def onBlur(): Unit
  def onChange(): Unit
  def onFocus(): Unit
  def parser(input: String): String
}

object AnonFocusOnUpDown {
  @scala.inline
  def apply(
    focusOnUpDown: Boolean,
    max: Double,
    min: Double,
    onBlur: Callback,
    onChange: Callback,
    onFocus: Callback,
    parser: String => CallbackTo[String],
    prefixCls: String,
    step: Double,
    useTouch: Boolean
  ): AnonFocusOnUpDown = {
    val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], useTouch = useTouch.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.updateDynamic("parser")(js.Any.fromFunction1((t0: java.lang.String) => parser(t0).runNow()))
    __obj.asInstanceOf[AnonFocusOnUpDown]
  }
}

