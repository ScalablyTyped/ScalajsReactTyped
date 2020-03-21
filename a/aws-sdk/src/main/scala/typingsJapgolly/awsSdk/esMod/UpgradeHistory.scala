package typingsJapgolly.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeHistory extends js.Object {
  /**
    * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
    */
  var StartTimestamp: js.UndefOr[js.Date] = js.native
  /**
    *  A list of  UpgradeStepItem  s representing information about each step performed as pard of a specific Upgrade or Upgrade Eligibility Check. 
    */
  var StepsList: js.UndefOr[UpgradeStepsList] = js.native
  /**
    * A string that describes the update briefly
    */
  var UpgradeName: js.UndefOr[typingsJapgolly.awsSdk.esMod.UpgradeName] = js.native
  /**
    *  The overall status of the update. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStatus: js.UndefOr[typingsJapgolly.awsSdk.esMod.UpgradeStatus] = js.native
}

object UpgradeHistory {
  @scala.inline
  def apply(
    StartTimestamp: js.Date = null,
    StepsList: UpgradeStepsList = null,
    UpgradeName: UpgradeName = null,
    UpgradeStatus: UpgradeStatus = null
  ): UpgradeHistory = {
    val __obj = js.Dynamic.literal()
    if (StartTimestamp != null) __obj.updateDynamic("StartTimestamp")(StartTimestamp.asInstanceOf[js.Any])
    if (StepsList != null) __obj.updateDynamic("StepsList")(StepsList.asInstanceOf[js.Any])
    if (UpgradeName != null) __obj.updateDynamic("UpgradeName")(UpgradeName.asInstanceOf[js.Any])
    if (UpgradeStatus != null) __obj.updateDynamic("UpgradeStatus")(UpgradeStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeHistory]
  }
}

