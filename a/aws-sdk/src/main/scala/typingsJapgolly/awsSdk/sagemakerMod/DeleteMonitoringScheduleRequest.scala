package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMonitoringScheduleRequest extends js.Object {
  /**
    * The name of the monitoring schedule to delete.
    */
  var MonitoringScheduleName: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}

object DeleteMonitoringScheduleRequest {
  @scala.inline
  def apply(MonitoringScheduleName: MonitoringScheduleName): DeleteMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMonitoringScheduleRequest]
  }
}

