package typingsJapgolly.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetSummary extends js.Object {
  /**
    * The identifier used by users to sign into the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.CompanyCode] = js.native
  /**
    * The time when the fleet was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.FleetArn] = js.native
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.FleetName] = js.native
  /**
    * The status of the fleet.
    */
  var FleetStatus: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.FleetStatus] = js.native
  /**
    * The time when the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
}

object FleetSummary {
  @scala.inline
  def apply(
    CompanyCode: CompanyCode = null,
    CreatedTime: js.Date = null,
    DisplayName: DisplayName = null,
    FleetArn: FleetArn = null,
    FleetName: FleetName = null,
    FleetStatus: FleetStatus = null,
    LastUpdatedTime: js.Date = null
  ): FleetSummary = {
    val __obj = js.Dynamic.literal()
    if (CompanyCode != null) __obj.updateDynamic("CompanyCode")(CompanyCode.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn.asInstanceOf[js.Any])
    if (FleetName != null) __obj.updateDynamic("FleetName")(FleetName.asInstanceOf[js.Any])
    if (FleetStatus != null) __obj.updateDynamic("FleetStatus")(FleetStatus.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetSummary]
  }
}

