package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerObject extends js.Object {
  def handleEvent(evt: Event_): Unit
}

object EventListenerObject {
  @scala.inline
  def apply(handleEvent: Event_ => Callback): EventListenerObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[EventListenerObject]
  }
}

