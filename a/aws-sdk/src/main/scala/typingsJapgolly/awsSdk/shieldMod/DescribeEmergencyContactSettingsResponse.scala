package typingsJapgolly.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEmergencyContactSettingsResponse extends js.Object {
  /**
    * A list of email addresses that the DRT can use to contact you during a suspected attack.
    */
  var EmergencyContactList: js.UndefOr[typingsJapgolly.awsSdk.shieldMod.EmergencyContactList] = js.native
}

object DescribeEmergencyContactSettingsResponse {
  @scala.inline
  def apply(EmergencyContactList: EmergencyContactList = null): DescribeEmergencyContactSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (EmergencyContactList != null) __obj.updateDynamic("EmergencyContactList")(EmergencyContactList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEmergencyContactSettingsResponse]
  }
}

