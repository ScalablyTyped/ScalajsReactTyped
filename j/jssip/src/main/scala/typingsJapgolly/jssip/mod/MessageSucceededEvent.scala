package typingsJapgolly.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSucceededEvent extends js.Object {
  var originator: String
  var response: js.UndefOr[IncomingResponse] = js.undefined
}

object MessageSucceededEvent {
  @scala.inline
  def apply(originator: String, response: IncomingResponse = null): MessageSucceededEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSucceededEvent]
  }
}

