package typingsJapgolly.gapiClientDfareporting

import typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting.Recipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailOwner extends js.Object {
  /** Whether the report should be emailed to the report owner. */
  var emailOwner: js.UndefOr[Boolean] = js.undefined
  /** The type of delivery for the owner to receive, if enabled. */
  var emailOwnerDeliveryType: js.UndefOr[String] = js.undefined
  /** The message to be sent with each email. */
  var message: js.UndefOr[String] = js.undefined
  /** The list of recipients to which to email the report. */
  var recipients: js.UndefOr[js.Array[Recipient]] = js.undefined
}

object AnonEmailOwner {
  @scala.inline
  def apply(
    emailOwner: js.UndefOr[Boolean] = js.undefined,
    emailOwnerDeliveryType: String = null,
    message: String = null,
    recipients: js.Array[Recipient] = null
  ): AnonEmailOwner = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emailOwner)) __obj.updateDynamic("emailOwner")(emailOwner.asInstanceOf[js.Any])
    if (emailOwnerDeliveryType != null) __obj.updateDynamic("emailOwnerDeliveryType")(emailOwnerDeliveryType.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailOwner]
  }
}

