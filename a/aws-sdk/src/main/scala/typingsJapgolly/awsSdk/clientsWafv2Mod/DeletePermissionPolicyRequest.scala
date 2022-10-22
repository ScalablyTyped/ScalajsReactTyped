package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePermissionPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group from which you want to delete the policy. You must be the owner of the rule group to perform this operation.
    */
  var ResourceArn: typingsJapgolly.awsSdk.clientsWafv2Mod.ResourceArn
}
object DeletePermissionPolicyRequest {
  
  inline def apply(ResourceArn: ResourceArn): DeletePermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionPolicyRequest]
  }
  
  extension [Self <: DeletePermissionPolicyRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
