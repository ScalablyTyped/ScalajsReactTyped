package typingsJapgolly.rmcAlign

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Boolean
  var monitorBufferTime: Double
  var monitorWindowResize: Boolean
  def onAlign(): Unit
  def target(): Window_
}

object AnonDisabled {
  @scala.inline
  def apply(
    disabled: Boolean,
    monitorBufferTime: Double,
    monitorWindowResize: Boolean,
    onAlign: Callback,
    target: CallbackTo[Window_]
  ): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], monitorBufferTime = monitorBufferTime.asInstanceOf[js.Any], monitorWindowResize = monitorWindowResize.asInstanceOf[js.Any])
    __obj.updateDynamic("onAlign")(onAlign.toJsFn)
    __obj.updateDynamic("target")(target.toJsFn)
    __obj.asInstanceOf[AnonDisabled]
  }
}

