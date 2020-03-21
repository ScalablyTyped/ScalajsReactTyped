package typingsJapgolly.jssip.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionUpdateEvent extends js.Object {
  var request: IncomingRequest
  def callback(): Unit
  def reject(options: SessionRejectOptions): Unit
}

object SessionUpdateEvent {
  @scala.inline
  def apply(callback: Callback, reject: SessionRejectOptions => Callback, request: IncomingRequest): SessionUpdateEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: typingsJapgolly.jssip.mod.SessionRejectOptions) => reject(t0).runNow()))
    __obj.asInstanceOf[SessionUpdateEvent]
  }
}

