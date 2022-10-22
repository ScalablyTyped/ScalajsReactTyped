package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.Condition
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var conditions: js.UndefOr[Input[js.Array[Input[Condition]]]] = js.undefined
}
object NetworkPolicyStatus {
  
  inline def apply(): NetworkPolicyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyStatus]
  }
  
  extension [Self <: NetworkPolicyStatus](x: Self) {
    
    inline def setConditions(value: Input[js.Array[Input[Condition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[Condition]*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
