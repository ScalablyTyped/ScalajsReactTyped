package typingsJapgolly.firebaseFunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetails extends js.Object {
  var details: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[js.Any] = js.undefined
}

object AnonDetails {
  @scala.inline
  def apply(details: js.Any = null, message: js.Any = null, status: js.Any = null): AnonDetails = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
}

