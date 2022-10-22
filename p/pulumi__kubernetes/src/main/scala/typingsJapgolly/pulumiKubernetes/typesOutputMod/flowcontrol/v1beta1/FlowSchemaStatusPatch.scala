package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaStatus represents the current state of a FlowSchema.
  */
trait FlowSchemaStatusPatch extends StObject {
  
  /**
    * `conditions` is a list of the current states of FlowSchema.
    */
  var conditions: js.Array[FlowSchemaConditionPatch]
}
object FlowSchemaStatusPatch {
  
  inline def apply(conditions: js.Array[FlowSchemaConditionPatch]): FlowSchemaStatusPatch = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaStatusPatch]
  }
  
  extension [Self <: FlowSchemaStatusPatch](x: Self) {
    
    inline def setConditions(value: js.Array[FlowSchemaConditionPatch]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: FlowSchemaConditionPatch*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
