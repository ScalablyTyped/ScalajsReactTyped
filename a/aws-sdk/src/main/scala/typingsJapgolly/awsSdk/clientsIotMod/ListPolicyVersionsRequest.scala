package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPolicyVersionsRequest extends StObject {
  
  /**
    * The policy name.
    */
  var policyName: PolicyName
}
object ListPolicyVersionsRequest {
  
  inline def apply(policyName: PolicyName): ListPolicyVersionsRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyVersionsRequest]
  }
  
  extension [Self <: ListPolicyVersionsRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
  }
}
