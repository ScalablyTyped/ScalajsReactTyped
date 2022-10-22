package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup for which you want to get the policy.
    */
  var ResourceArn: typingsJapgolly.awsSdk.clientsWafregionalMod.ResourceArn
}
object GetPermissionPolicyRequest {
  
  inline def apply(ResourceArn: ResourceArn): GetPermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionPolicyRequest]
  }
  
  extension [Self <: GetPermissionPolicyRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
