package typingsJapgolly.twilio.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  def toPayload(): GrantPayload
}

object Grant {
  @scala.inline
  def apply(toPayload: CallbackTo[GrantPayload]): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toPayload")(toPayload.toJsFn)
    __obj.asInstanceOf[Grant]
  }
}

