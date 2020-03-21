package typingsJapgolly.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeStepItem extends js.Object {
  /**
    * A list of strings containing detailed information about the errors encountered in a particular step.
    */
  var Issues: js.UndefOr[typingsJapgolly.awsSdk.esMod.Issues] = js.native
  /**
    * The Floating point value representing progress percentage of a particular step.
    */
  var ProgressPercent: js.UndefOr[Double] = js.native
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[typingsJapgolly.awsSdk.esMod.UpgradeStep] = js.native
  /**
    *  The status of a particular step during an upgrade. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.native
}

object UpgradeStepItem {
  @scala.inline
  def apply(
    Issues: Issues = null,
    ProgressPercent: Int | scala.Double = null,
    UpgradeStep: UpgradeStep = null,
    UpgradeStepStatus: UpgradeStatus = null
  ): UpgradeStepItem = {
    val __obj = js.Dynamic.literal()
    if (Issues != null) __obj.updateDynamic("Issues")(Issues.asInstanceOf[js.Any])
    if (ProgressPercent != null) __obj.updateDynamic("ProgressPercent")(ProgressPercent.asInstanceOf[js.Any])
    if (UpgradeStep != null) __obj.updateDynamic("UpgradeStep")(UpgradeStep.asInstanceOf[js.Any])
    if (UpgradeStepStatus != null) __obj.updateDynamic("UpgradeStepStatus")(UpgradeStepStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeStepItem]
  }
}

