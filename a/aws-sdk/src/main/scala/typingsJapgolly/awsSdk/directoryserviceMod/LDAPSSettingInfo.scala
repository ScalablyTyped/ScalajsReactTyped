package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDAPSSettingInfo extends js.Object {
  /**
    * The state of the LDAPS settings.
    */
  var LDAPSStatus: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.LDAPSStatus] = js.native
  /**
    * Describes a state change for LDAPS.
    */
  var LDAPSStatusReason: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.LDAPSStatusReason] = js.native
  /**
    * The date and time when the LDAPS settings were last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.native
}

object LDAPSSettingInfo {
  @scala.inline
  def apply(
    LDAPSStatus: LDAPSStatus = null,
    LDAPSStatusReason: LDAPSStatusReason = null,
    LastUpdatedDateTime: js.Date = null
  ): LDAPSSettingInfo = {
    val __obj = js.Dynamic.literal()
    if (LDAPSStatus != null) __obj.updateDynamic("LDAPSStatus")(LDAPSStatus.asInstanceOf[js.Any])
    if (LDAPSStatusReason != null) __obj.updateDynamic("LDAPSStatusReason")(LDAPSStatusReason.asInstanceOf[js.Any])
    if (LastUpdatedDateTime != null) __obj.updateDynamic("LastUpdatedDateTime")(LastUpdatedDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPSSettingInfo]
  }
}

