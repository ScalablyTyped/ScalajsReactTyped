package typingsJapgolly.chromeApps.chrome.gcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcmError extends js.Object {
  /** Additional details related to the error, when available. */
  var detail: js.Object
  /** The error message describing the problem. */
  var errorMessage: String
  /** The ID of the message with this error, if error is related to a specific message. */
  var messageId: js.UndefOr[String] = js.undefined
}

object GcmError {
  @scala.inline
  def apply(detail: js.Object, errorMessage: String, messageId: String = null): GcmError = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcmError]
  }
}

