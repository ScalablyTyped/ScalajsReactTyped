package typingsJapgolly.jssip.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionReferEvent extends js.Object {
  var request: IncomingRequest
  def accept(): Unit
  def reject(): Unit
}

object SessionReferEvent {
  @scala.inline
  def apply(accept: Callback, reject: Callback, request: IncomingRequest): SessionReferEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.updateDynamic("reject")(reject.toJsFn)
    __obj.asInstanceOf[SessionReferEvent]
  }
}

