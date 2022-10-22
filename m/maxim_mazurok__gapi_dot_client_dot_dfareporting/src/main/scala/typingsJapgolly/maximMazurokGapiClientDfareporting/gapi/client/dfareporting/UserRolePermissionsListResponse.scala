package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserRolePermissionsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** User role permission collection. */
  var userRolePermissions: js.UndefOr[js.Array[UserRolePermission]] = js.undefined
}
object UserRolePermissionsListResponse {
  
  inline def apply(): UserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRolePermissionsListResponse]
  }
  
  extension [Self <: UserRolePermissionsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUserRolePermissions(value: js.Array[UserRolePermission]): Self = StObject.set(x, "userRolePermissions", value.asInstanceOf[js.Any])
    
    inline def setUserRolePermissionsUndefined: Self = StObject.set(x, "userRolePermissions", js.undefined)
    
    inline def setUserRolePermissionsVarargs(value: UserRolePermission*): Self = StObject.set(x, "userRolePermissions", js.Array(value*))
  }
}
