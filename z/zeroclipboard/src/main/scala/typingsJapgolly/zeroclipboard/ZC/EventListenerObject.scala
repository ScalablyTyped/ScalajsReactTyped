package typingsJapgolly.zeroclipboard.ZC

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerObject[T /* <: ZeroClipboardEvent */] extends js.Object {
  def handleEvent(ev: T): Unit
}

object EventListenerObject {
  @scala.inline
  def apply[T /* <: ZeroClipboardEvent */](handleEvent: T => Callback): EventListenerObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: T) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[EventListenerObject[T]]
  }
}

