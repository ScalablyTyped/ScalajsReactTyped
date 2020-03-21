package typingsJapgolly.webBluetooth

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEventHandlers extends js.Object {
  def onserviceadded(ev: Event_): js.Any
  def onservicechanged(ev: Event_): js.Any
  def onserviceremoved(ev: Event_): js.Any
}

object ServiceEventHandlers {
  @scala.inline
  def apply(
    onserviceadded: Event_ => CallbackTo[js.Any],
    onservicechanged: Event_ => CallbackTo[js.Any],
    onserviceremoved: Event_ => CallbackTo[js.Any]
  ): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onserviceadded")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onserviceadded(t0).runNow()))
    __obj.updateDynamic("onservicechanged")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onservicechanged(t0).runNow()))
    __obj.updateDynamic("onserviceremoved")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onserviceremoved(t0).runNow()))
    __obj.asInstanceOf[ServiceEventHandlers]
  }
}

