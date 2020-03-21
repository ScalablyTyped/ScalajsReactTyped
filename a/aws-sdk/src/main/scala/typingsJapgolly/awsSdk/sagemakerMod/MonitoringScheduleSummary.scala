package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringScheduleSummary extends js.Object {
  /**
    * The creation time of the monitoring schedule.
    */
  var CreationTime: js.Date = js.native
  /**
    * The name of the endpoint using the monitoring schedule.
    */
  var EndpointName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * The last time the monitoring schedule was modified.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleArn = js.native
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  /**
    * The status of the monitoring schedule.
    */
  var MonitoringScheduleStatus: ScheduleStatus = js.native
}

object MonitoringScheduleSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus,
    EndpointName: EndpointName = null
  ): MonitoringScheduleSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleSummary]
  }
}

