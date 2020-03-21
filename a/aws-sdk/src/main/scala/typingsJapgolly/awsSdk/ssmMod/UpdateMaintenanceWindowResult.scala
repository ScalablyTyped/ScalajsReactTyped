package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceWindowResult extends js.Object {
  /**
    * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
    */
  var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.native
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.native
  /**
    * An optional description of the update.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.native
  /**
    * Whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.native
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The ID of the created maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}

object UpdateMaintenanceWindowResult {
  @scala.inline
  def apply(
    AllowUnassociatedTargets: js.UndefOr[scala.Boolean] = js.undefined,
    Cutoff: Int | Double = null,
    Description: MaintenanceWindowDescription = null,
    Duration: Int | Double = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    EndDate: MaintenanceWindowStringDateTime = null,
    Name: MaintenanceWindowName = null,
    Schedule: MaintenanceWindowSchedule = null,
    ScheduleTimezone: MaintenanceWindowTimezone = null,
    StartDate: MaintenanceWindowStringDateTime = null,
    WindowId: MaintenanceWindowId = null
  ): UpdateMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowUnassociatedTargets)) __obj.updateDynamic("AllowUnassociatedTargets")(AllowUnassociatedTargets.asInstanceOf[js.Any])
    if (Cutoff != null) __obj.updateDynamic("Cutoff")(Cutoff.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (ScheduleTimezone != null) __obj.updateDynamic("ScheduleTimezone")(ScheduleTimezone.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowResult]
  }
}

