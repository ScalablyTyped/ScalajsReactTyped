package typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.
  */
trait PodFailurePolicyOnPodConditionsPatternPatch extends StObject {
  
  /**
    * Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
    */
  var status: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object PodFailurePolicyOnPodConditionsPatternPatch {
  
  inline def apply(): PodFailurePolicyOnPodConditionsPatternPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodFailurePolicyOnPodConditionsPatternPatch]
  }
  
  extension [Self <: PodFailurePolicyOnPodConditionsPatternPatch](x: Self) {
    
    inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
