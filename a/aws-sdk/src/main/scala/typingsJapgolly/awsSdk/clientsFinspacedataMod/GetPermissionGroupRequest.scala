package typingsJapgolly.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionGroupRequest extends StObject {
  
  /**
    * The unique identifier for the permission group.
    */
  var permissionGroupId: PermissionGroupId
}
object GetPermissionGroupRequest {
  
  inline def apply(permissionGroupId: PermissionGroupId): GetPermissionGroupRequest = {
    val __obj = js.Dynamic.literal(permissionGroupId = permissionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionGroupRequest]
  }
  
  extension [Self <: GetPermissionGroupRequest](x: Self) {
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
  }
}
