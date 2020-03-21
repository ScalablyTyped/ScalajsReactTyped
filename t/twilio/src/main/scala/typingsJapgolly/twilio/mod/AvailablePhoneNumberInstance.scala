package typingsJapgolly.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailablePhoneNumberInstance extends js.Object {
  var local: AvailablePhoneNumberResourceGroup
  var mobile: AvailablePhoneNumberResourceGroup
  var tollFree: AvailablePhoneNumberResourceGroup
}

object AvailablePhoneNumberInstance {
  @scala.inline
  def apply(
    local: AvailablePhoneNumberResourceGroup,
    mobile: AvailablePhoneNumberResourceGroup,
    tollFree: AvailablePhoneNumberResourceGroup
  ): AvailablePhoneNumberInstance = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], tollFree = tollFree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AvailablePhoneNumberInstance]
  }
}

