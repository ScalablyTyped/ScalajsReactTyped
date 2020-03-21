package typingsJapgolly.vueTelInput.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputWatch extends js.Object {
  def state(value: js.Any): Unit
  def value(): Unit
}

object VueTelInputWatch {
  @scala.inline
  def apply(state: js.Any => Callback, value: Callback): VueTelInputWatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(js.Any.fromFunction1((t0: js.Any) => state(t0).runNow()))
    __obj.updateDynamic("value")(value.toJsFn)
    __obj.asInstanceOf[VueTelInputWatch]
  }
}

