package typingsJapgolly.onfleetNodeOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecipientName extends js.Object {
  var recipientName: String | Null
  var recipientNotes: String | Null
  var recipientSkipSMSNotifications: String | Null
  var useMerchantForProxy: String | Null
}

object AnonRecipientName {
  @scala.inline
  def apply(
    recipientName: String = null,
    recipientNotes: String = null,
    recipientSkipSMSNotifications: String = null,
    useMerchantForProxy: String = null
  ): AnonRecipientName = {
    val __obj = js.Dynamic.literal()
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName.asInstanceOf[js.Any])
    if (recipientNotes != null) __obj.updateDynamic("recipientNotes")(recipientNotes.asInstanceOf[js.Any])
    if (recipientSkipSMSNotifications != null) __obj.updateDynamic("recipientSkipSMSNotifications")(recipientSkipSMSNotifications.asInstanceOf[js.Any])
    if (useMerchantForProxy != null) __obj.updateDynamic("useMerchantForProxy")(useMerchantForProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecipientName]
  }
}

