package typingsJapgolly.expo

import japgolly.scalajs.react.Callback
import typingsJapgolly.expo.updatesMod.UpdateEvent
import typingsJapgolly.expo.updatesMod.UpdateEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventListener extends js.Object {
  var eventListener: js.UndefOr[UpdateEventListener] = js.undefined
}

object AnonEventListener {
  @scala.inline
  def apply(eventListener: /* event */ UpdateEvent => Callback = null): AnonEventListener = {
    val __obj = js.Dynamic.literal()
    if (eventListener != null) __obj.updateDynamic("eventListener")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.expo.updatesMod.UpdateEvent) => eventListener(t0).runNow()))
    __obj.asInstanceOf[AnonEventListener]
  }
}

