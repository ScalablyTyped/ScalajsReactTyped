package typingsJapgolly.soundjs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleEvent extends js.Object {
  def handleEvent(eventObj: js.Object): Boolean
}

object AnonHandleEvent {
  @scala.inline
  def apply(handleEvent: js.Object => CallbackTo[Boolean]): AnonHandleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: js.Object) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[AnonHandleEvent]
  }
}

