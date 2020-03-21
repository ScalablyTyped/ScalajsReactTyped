package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLDAPSSettingsResult extends js.Object {
  /**
    * Information about LDAP security for the specified directory, including status of enablement, state last updated date time, and the reason for the state.
    */
  var LDAPSSettingsInfo: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.LDAPSSettingsInfo] = js.native
  /**
    * The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and there is another page.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.NextToken] = js.native
}

object DescribeLDAPSSettingsResult {
  @scala.inline
  def apply(LDAPSSettingsInfo: LDAPSSettingsInfo = null, NextToken: NextToken = null): DescribeLDAPSSettingsResult = {
    val __obj = js.Dynamic.literal()
    if (LDAPSSettingsInfo != null) __obj.updateDynamic("LDAPSSettingsInfo")(LDAPSSettingsInfo.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLDAPSSettingsResult]
  }
}

