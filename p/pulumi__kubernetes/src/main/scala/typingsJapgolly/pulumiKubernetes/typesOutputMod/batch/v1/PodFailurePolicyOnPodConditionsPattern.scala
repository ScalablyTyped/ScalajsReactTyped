package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.
  */
trait PodFailurePolicyOnPodConditionsPattern extends StObject {
  
  /**
    * Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
    */
  var status: String
  
  /**
    * Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.
    */
  var `type`: String
}
object PodFailurePolicyOnPodConditionsPattern {
  
  inline def apply(status: String, `type`: String): PodFailurePolicyOnPodConditionsPattern = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodFailurePolicyOnPodConditionsPattern]
  }
  
  extension [Self <: PodFailurePolicyOnPodConditionsPattern](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
