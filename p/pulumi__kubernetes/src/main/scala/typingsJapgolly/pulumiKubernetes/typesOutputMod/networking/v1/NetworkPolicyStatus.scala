package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicyStatus describe the current state of the NetworkPolicy.
  */
trait NetworkPolicyStatus extends StObject {
  
  /**
    * Conditions holds an array of metav1.Condition that describe the state of the NetworkPolicy. Current service state
    */
  var conditions: js.Array[Condition]
}
object NetworkPolicyStatus {
  
  inline def apply(conditions: js.Array[Condition]): NetworkPolicyStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyStatus]
  }
  
  extension [Self <: NetworkPolicyStatus](x: Self) {
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
