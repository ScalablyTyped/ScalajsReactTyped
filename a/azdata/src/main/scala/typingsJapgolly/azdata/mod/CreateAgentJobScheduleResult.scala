package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentJobScheduleResult
  extends StObject
     with ResultStatus {
  
  var schedule: AgentJobScheduleInfo
}
object CreateAgentJobScheduleResult {
  
  inline def apply(errorMessage: String, schedule: AgentJobScheduleInfo, success: Boolean): CreateAgentJobScheduleResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentJobScheduleResult]
  }
  
  extension [Self <: CreateAgentJobScheduleResult](x: Self) {
    
    inline def setSchedule(value: AgentJobScheduleInfo): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
  }
}
