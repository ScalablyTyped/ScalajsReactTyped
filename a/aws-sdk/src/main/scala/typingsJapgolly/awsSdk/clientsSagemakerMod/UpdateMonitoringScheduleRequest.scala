package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMonitoringScheduleRequest extends StObject {
  
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typingsJapgolly.awsSdk.clientsSagemakerMod.MonitoringScheduleConfig
  
  /**
    * The name of the monitoring schedule. The name must be unique within an Amazon Web Services Region within an Amazon Web Services account.
    */
  var MonitoringScheduleName: typingsJapgolly.awsSdk.clientsSagemakerMod.MonitoringScheduleName
}
object UpdateMonitoringScheduleRequest {
  
  inline def apply(MonitoringScheduleConfig: MonitoringScheduleConfig, MonitoringScheduleName: MonitoringScheduleName): UpdateMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitoringScheduleRequest]
  }
  
  extension [Self <: UpdateMonitoringScheduleRequest](x: Self) {
    
    inline def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = StObject.set(x, "MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
