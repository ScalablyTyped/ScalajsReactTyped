package typingsJapgolly.actionsOnGoogle.v1Mod

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.custom_payload
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.google
import typingsJapgolly.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageGooglePayload
  extends DialogflowV1BaseGoogleMessage[custom_payload]
     with DialogflowV1Message {
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object DialogflowV1MessageGooglePayload {
  @scala.inline
  def apply(platform: google, payload: ApiClientObjectMap[_] = null, `type`: custom_payload = null): DialogflowV1MessageGooglePayload = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageGooglePayload]
  }
}

