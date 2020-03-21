package typingsJapgolly.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOutboundVoiceContactResponse extends js.Object {
  /**
    * The identifier of this contact within the Amazon Connect instance.
    */
  var ContactId: js.UndefOr[typingsJapgolly.awsSdk.connectMod.ContactId] = js.native
}

object StartOutboundVoiceContactResponse {
  @scala.inline
  def apply(ContactId: ContactId = null): StartOutboundVoiceContactResponse = {
    val __obj = js.Dynamic.literal()
    if (ContactId != null) __obj.updateDynamic("ContactId")(ContactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOutboundVoiceContactResponse]
  }
}

