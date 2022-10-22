package typingsJapgolly.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyOptions extends StObject {
  
  /**
    * Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for
    * policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in
    * the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role
    * bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM
    * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    */
  var requestedPolicyVersion: js.UndefOr[Double] = js.undefined
}
object GetPolicyOptions {
  
  inline def apply(): GetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyOptions]
  }
  
  extension [Self <: GetPolicyOptions](x: Self) {
    
    inline def setRequestedPolicyVersion(value: Double): Self = StObject.set(x, "requestedPolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setRequestedPolicyVersionUndefined: Self = StObject.set(x, "requestedPolicyVersion", js.undefined)
  }
}
