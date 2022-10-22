package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePolicyVersionResponse extends StObject {
  
  /**
    * A structure containing details about the new policy version.
    */
  var PolicyVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsIamMod.PolicyVersion] = js.undefined
}
object CreatePolicyVersionResponse {
  
  inline def apply(): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
  
  extension [Self <: CreatePolicyVersionResponse](x: Self) {
    
    inline def setPolicyVersion(value: PolicyVersion): Self = StObject.set(x, "PolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionUndefined: Self = StObject.set(x, "PolicyVersion", js.undefined)
  }
}
