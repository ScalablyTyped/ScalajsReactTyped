package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The time that this dashboard was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * Dashboard ID.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * The last time that this dashboard was published.
    */
  var LastPublishedTime: js.UndefOr[js.Date] = js.native
  /**
    * The last time that this dashboard was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * A display name for the dashboard.
    */
  var Name: js.UndefOr[DashboardName] = js.native
  /**
    * Published version number.
    */
  var PublishedVersionNumber: js.UndefOr[VersionNumber] = js.native
}

object DashboardSummary {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatedTime: js.Date = null,
    DashboardId: RestrictiveResourceId = null,
    LastPublishedTime: js.Date = null,
    LastUpdatedTime: js.Date = null,
    Name: DashboardName = null,
    PublishedVersionNumber: Int | scala.Double = null
  ): DashboardSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DashboardId != null) __obj.updateDynamic("DashboardId")(DashboardId.asInstanceOf[js.Any])
    if (LastPublishedTime != null) __obj.updateDynamic("LastPublishedTime")(LastPublishedTime.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PublishedVersionNumber != null) __obj.updateDynamic("PublishedVersionNumber")(PublishedVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSummary]
  }
}

