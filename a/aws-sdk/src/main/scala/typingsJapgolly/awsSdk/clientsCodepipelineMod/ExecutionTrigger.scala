package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionTrigger extends StObject {
  
  /**
    * Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that triggered the pipeline execution or the user ARN for a user-initiated start-pipeline-execution CLI command.
    */
  var triggerDetail: js.UndefOr[TriggerDetail] = js.undefined
  
  /**
    * The type of change-detection method, command, or user interaction that started a pipeline execution.
    */
  var triggerType: js.UndefOr[TriggerType] = js.undefined
}
object ExecutionTrigger {
  
  inline def apply(): ExecutionTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionTrigger]
  }
  
  extension [Self <: ExecutionTrigger](x: Self) {
    
    inline def setTriggerDetail(value: TriggerDetail): Self = StObject.set(x, "triggerDetail", value.asInstanceOf[js.Any])
    
    inline def setTriggerDetailUndefined: Self = StObject.set(x, "triggerDetail", js.undefined)
    
    inline def setTriggerType(value: TriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
  }
}
