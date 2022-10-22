package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
  */
trait PriorityLevelConfigurationStatus extends StObject {
  
  /**
    * `conditions` is the current state of "request-priority".
    */
  var conditions: js.Array[PriorityLevelConfigurationCondition]
}
object PriorityLevelConfigurationStatus {
  
  inline def apply(conditions: js.Array[PriorityLevelConfigurationCondition]): PriorityLevelConfigurationStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationStatus]
  }
  
  extension [Self <: PriorityLevelConfigurationStatus](x: Self) {
    
    inline def setConditions(value: js.Array[PriorityLevelConfigurationCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: PriorityLevelConfigurationCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
