package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApnsdevicetoken extends js.Object {
  var apns_device_token: js.UndefOr[String] = js.native
  var apns_environment: js.UndefOr[String] = js.native
}

object AnonApnsdevicetoken {
  @scala.inline
  def apply(apns_device_token: String = null, apns_environment: String = null): AnonApnsdevicetoken = {
    val __obj = js.Dynamic.literal()
    if (apns_device_token != null) __obj.updateDynamic("apns_device_token")(apns_device_token.asInstanceOf[js.Any])
    if (apns_environment != null) __obj.updateDynamic("apns_environment")(apns_environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApnsdevicetoken]
  }
}

