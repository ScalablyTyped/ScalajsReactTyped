package typingsJapgolly.googlePicker.google.picker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Picker extends js.Object {
  def dispose(): Unit
  def isVisible(): Boolean
  def setCallback(method: js.Function): Picker
  def setRelayUrl(url: String): Picker
  def setVisible(visible: Boolean): Picker
}

object Picker {
  @scala.inline
  def apply(
    dispose: Callback,
    isVisible: CallbackTo[Boolean],
    setCallback: js.Function => CallbackTo[Picker],
    setRelayUrl: String => CallbackTo[Picker],
    setVisible: Boolean => CallbackTo[Picker]
  ): Picker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("isVisible")(isVisible.toJsFn)
    __obj.updateDynamic("setCallback")(js.Any.fromFunction1((t0: js.Function) => setCallback(t0).runNow()))
    __obj.updateDynamic("setRelayUrl")(js.Any.fromFunction1((t0: java.lang.String) => setRelayUrl(t0).runNow()))
    __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: scala.Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[Picker]
  }
}

