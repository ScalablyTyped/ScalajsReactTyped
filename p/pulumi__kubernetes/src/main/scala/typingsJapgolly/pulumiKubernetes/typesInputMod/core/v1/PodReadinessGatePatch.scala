package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodReadinessGate contains the reference to a pod condition
  */
trait PodReadinessGatePatch extends StObject {
  
  /**
    * ConditionType refers to a condition in the pod's condition list with matching type.
    */
  var conditionType: js.UndefOr[Input[String]] = js.undefined
}
object PodReadinessGatePatch {
  
  inline def apply(): PodReadinessGatePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodReadinessGatePatch]
  }
  
  extension [Self <: PodReadinessGatePatch](x: Self) {
    
    inline def setConditionType(value: Input[String]): Self = StObject.set(x, "conditionType", value.asInstanceOf[js.Any])
    
    inline def setConditionTypeUndefined: Self = StObject.set(x, "conditionType", js.undefined)
  }
}
