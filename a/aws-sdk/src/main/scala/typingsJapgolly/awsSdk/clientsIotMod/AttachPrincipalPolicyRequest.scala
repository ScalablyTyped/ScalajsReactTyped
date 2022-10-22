package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachPrincipalPolicyRequest extends StObject {
  
  /**
    * The policy name.
    */
  var policyName: PolicyName
  
  /**
    * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
    */
  var principal: Principal
}
object AttachPrincipalPolicyRequest {
  
  inline def apply(policyName: PolicyName, principal: Principal): AttachPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachPrincipalPolicyRequest]
  }
  
  extension [Self <: AttachPrincipalPolicyRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
  }
}
