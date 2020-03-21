package typingsJapgolly.googleapis

import typingsJapgolly.googleapis.v32Mod.dfareportingV32.SchemaRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmailOwnerDeliveryType extends js.Object {
  var emailOwner: js.UndefOr[Boolean] = js.native
  var emailOwnerDeliveryType: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var recipients: js.UndefOr[js.Array[SchemaRecipient]] = js.native
}

object AnonEmailOwnerDeliveryType {
  @scala.inline
  def apply(
    emailOwner: js.UndefOr[Boolean] = js.undefined,
    emailOwnerDeliveryType: String = null,
    message: String = null,
    recipients: js.Array[SchemaRecipient] = null
  ): AnonEmailOwnerDeliveryType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emailOwner)) __obj.updateDynamic("emailOwner")(emailOwner.asInstanceOf[js.Any])
    if (emailOwnerDeliveryType != null) __obj.updateDynamic("emailOwnerDeliveryType")(emailOwnerDeliveryType.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailOwnerDeliveryType]
  }
}

