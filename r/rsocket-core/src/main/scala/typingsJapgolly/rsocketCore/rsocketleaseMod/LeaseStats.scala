package typingsJapgolly.rsocketCore.rsocketleaseMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseStats extends js.Object {
  def onEvent(event: EventType): Unit
}

object LeaseStats {
  @scala.inline
  def apply(onEvent: EventType => Callback): LeaseStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onEvent")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketCore.rsocketleaseMod.EventType) => onEvent(t0).runNow()))
    __obj.asInstanceOf[LeaseStats]
  }
}

