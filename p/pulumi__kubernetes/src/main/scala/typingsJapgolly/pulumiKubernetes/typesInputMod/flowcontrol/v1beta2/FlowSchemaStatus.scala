package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaStatus represents the current state of a FlowSchema.
  */
trait FlowSchemaStatus extends StObject {
  
  /**
    * `conditions` is a list of the current states of FlowSchema.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[FlowSchemaCondition]]]] = js.undefined
}
object FlowSchemaStatus {
  
  inline def apply(): FlowSchemaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowSchemaStatus]
  }
  
  extension [Self <: FlowSchemaStatus](x: Self) {
    
    inline def setConditions(value: Input[js.Array[Input[FlowSchemaCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[FlowSchemaCondition]*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
