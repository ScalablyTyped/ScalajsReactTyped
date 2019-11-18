package typingsJapgolly.expo

import japgolly.scalajs.react.Callback
import typingsJapgolly.expo.buildUpdatesUpdatesMod.UpdateEvent
import typingsJapgolly.expo.buildUpdatesUpdatesMod.UpdateEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventListener extends js.Object {
  var eventListener: js.UndefOr[UpdateEventListener] = js.undefined
}

object Anon_EventListener {
  @scala.inline
  def apply(eventListener: /* event */ UpdateEvent => Callback = null): Anon_EventListener = {
    val __obj = js.Dynamic.literal()
    if (eventListener != null) __obj.updateDynamic("eventListener")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.expo.buildUpdatesUpdatesMod.UpdateEvent) => eventListener(t0).runNow()))
    __obj.asInstanceOf[Anon_EventListener]
  }
}

