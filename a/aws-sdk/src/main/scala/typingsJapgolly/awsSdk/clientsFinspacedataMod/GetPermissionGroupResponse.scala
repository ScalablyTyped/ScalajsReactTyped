package typingsJapgolly.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionGroupResponse extends StObject {
  
  var permissionGroup: js.UndefOr[PermissionGroup] = js.undefined
}
object GetPermissionGroupResponse {
  
  inline def apply(): GetPermissionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionGroupResponse]
  }
  
  extension [Self <: GetPermissionGroupResponse](x: Self) {
    
    inline def setPermissionGroup(value: PermissionGroup): Self = StObject.set(x, "permissionGroup", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupUndefined: Self = StObject.set(x, "permissionGroup", js.undefined)
  }
}
