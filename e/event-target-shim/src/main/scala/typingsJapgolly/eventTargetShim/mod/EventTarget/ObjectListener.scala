package typingsJapgolly.eventTargetShim.mod.EventTarget

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectListener[TEvent] extends js.Object {
  def handleEvent(event: TEvent): Unit
}

object ObjectListener {
  @scala.inline
  def apply[TEvent](handleEvent: TEvent => Callback): ObjectListener[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: TEvent) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[ObjectListener[TEvent]]
  }
}

