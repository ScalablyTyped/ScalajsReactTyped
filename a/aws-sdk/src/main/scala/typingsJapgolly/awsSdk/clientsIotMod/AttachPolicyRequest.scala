package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachPolicyRequest extends StObject {
  
  /**
    * The name of the policy to attach.
    */
  var policyName: PolicyName
  
  /**
    * The identity to which the policy is attached. For example, a thing group or a certificate.
    */
  var target: PolicyTarget
}
object AttachPolicyRequest {
  
  inline def apply(policyName: PolicyName, target: PolicyTarget): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachPolicyRequest]
  }
  
  extension [Self <: AttachPolicyRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: PolicyTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
