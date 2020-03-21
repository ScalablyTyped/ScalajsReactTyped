package typingsJapgolly.micro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object AnonMessage {
  @scala.inline
  def apply(
    message: String = null,
    stack: String = null,
    status: Int | Double = null,
    statusCode: Int | Double = null
  ): AnonMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

