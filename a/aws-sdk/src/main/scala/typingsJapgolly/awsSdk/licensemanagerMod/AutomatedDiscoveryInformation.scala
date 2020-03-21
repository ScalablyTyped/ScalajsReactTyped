package typingsJapgolly.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomatedDiscoveryInformation extends js.Object {
  /**
    * Time that automated discovery last ran.
    */
  var LastRunTime: js.UndefOr[js.Date] = js.native
}

object AutomatedDiscoveryInformation {
  @scala.inline
  def apply(LastRunTime: js.Date = null): AutomatedDiscoveryInformation = {
    val __obj = js.Dynamic.literal()
    if (LastRunTime != null) __obj.updateDynamic("LastRunTime")(LastRunTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomatedDiscoveryInformation]
  }
}

