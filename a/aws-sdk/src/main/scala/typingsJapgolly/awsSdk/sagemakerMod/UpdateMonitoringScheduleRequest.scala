package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMonitoringScheduleRequest extends js.Object {
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleConfig = js.native
  /**
    * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
    */
  var MonitoringScheduleName: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}

object UpdateMonitoringScheduleRequest {
  @scala.inline
  def apply(MonitoringScheduleConfig: MonitoringScheduleConfig, MonitoringScheduleName: MonitoringScheduleName): UpdateMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateMonitoringScheduleRequest]
  }
}

