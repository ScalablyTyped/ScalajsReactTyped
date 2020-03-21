package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomerId extends js.Object {
  var customerId: js.UndefOr[String] = js.native
  var entityId: js.UndefOr[String] = js.native
  var profileId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var userEmail: js.UndefOr[String] = js.native
}

object AnonCustomerId {
  @scala.inline
  def apply(
    customerId: String = null,
    entityId: String = null,
    profileId: String = null,
    `type`: String = null,
    userEmail: String = null
  ): AnonCustomerId = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomerId]
  }
}

